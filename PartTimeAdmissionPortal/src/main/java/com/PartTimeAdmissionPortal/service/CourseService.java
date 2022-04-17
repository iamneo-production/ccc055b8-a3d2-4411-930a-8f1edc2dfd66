package com.PartTimeAdmissionPortal.service;

import java.util.List;

import com.PartTimeAdmissionPortal.entity.CourseEntity;

public interface CourseService {
	public void deleteCourseService(int id, int courseId);
	public void addCourseService(CourseEntity courseEntityObj);
	public List<CourseEntity> viewCourseService(int courseId);
	public void editCourseService(CourseEntity cEntity, int courseId);
}
