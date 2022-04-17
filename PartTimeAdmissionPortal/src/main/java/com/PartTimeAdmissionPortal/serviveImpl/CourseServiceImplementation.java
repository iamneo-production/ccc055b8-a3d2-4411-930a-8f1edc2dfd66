package com.PartTimeAdmissionPortal.serviveImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PartTimeAdmissionPortal.entity.CourseEntity;
import com.PartTimeAdmissionPortal.repo.CourseRepo;
import com.PartTimeAdmissionPortal.service.CourseService;

@Service
public class CourseServiceImplementation implements CourseService {
	@Autowired
	private CourseRepo cr;
	
	@Override
	public void addCourseService(CourseEntity cEntity) {
		cr.save(cEntity);
	}
	@Override
	public List<CourseEntity> viewCourseService(int courseId){
		return cr.findById(courseId);
	}
	@Override
	public void editCourseService(CourseEntity cEntity, int courseId){
		CourseEntity temp = new CourseEntity();
		temp.setCourseId(cEntity.getCourseId());
		temp.setCourseName(cEntity.getCourseName());
		temp.setCourseDescription(cEntity.getCourseDescription());
		temp.setCourseDuration(cEntity.getCourseDuration());
		temp.setCourseStudents(cEntity.getCourseStudents());
		temp.setCourseTime(cEntity.getCourseTime());
		
		cr.save(temp);
	}
	@Override
	public void deleteCourseService(int id, int courseId) {
		if(cr.findById(id)!=null) {
			cr.deleteById(id);
		}
	}
}
