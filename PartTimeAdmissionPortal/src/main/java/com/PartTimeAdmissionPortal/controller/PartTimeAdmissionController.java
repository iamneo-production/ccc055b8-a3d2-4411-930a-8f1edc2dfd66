package com.PartTimeAdmissionPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PartTimeAdmissionPortal.entity.CourseEntity;
import com.PartTimeAdmissionPortal.service.CourseService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins="*")
public class PartTimeAdmissionController {
	@Autowired
	private CourseService cs;
	
	private int courseId=0;
	
	@PostMapping("/addCourse")
	public void addCourse(@RequestBody CourseEntity ce)
	{
		CourseEntity ce1= new CourseEntity();
		ce1.setCourseId(ce.getCourseId());
		ce1.setCourseName(ce.getCourseName());
		ce1.setCourseDescription(ce.getCourseDescription());
		ce1.setCourseDuration(ce.getCourseDuration());
		ce1.setCourseStudents(ce.getCourseStudents());
		ce1.setCourseTime(ce.getCourseTime());
		
		cs.addCourseService(ce1);
	}
	
	@GetMapping("/deleteCourse")
	public void deleteCourse(@RequestParam int id) {
		cs.deleteCourseService(id, this.courseId);
	}
	
	@GetMapping("/viewCourse")
	public List<CourseEntity> viewCourse(){
		return cs.viewCourseService(0);
		
	}
	
	@PostMapping("/editCourse")
	public void editCourse(@RequestBody CourseEntity ce) {
		
		CourseEntity ce2 = new CourseEntity();
		ce2.setCourseId(ce.getCourseId());
		ce2.setCourseName(ce.getCourseName());
		ce2.setCourseDescription(ce.getCourseDescription());
		ce2.setCourseDuration(ce.getCourseDuration());
		ce2.setCourseStudents(ce.getCourseStudents());
		ce2.setCourseTime(ce.getCourseTime());
		
		cs.editCourseService(ce2, this.courseId);
		
	}
	
}
