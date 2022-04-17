package com.PartTimeAdmissionPortal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PartTimeAdmissionPortal.entity.CourseEntity;


public interface CourseRepo extends JpaRepository<CourseEntity,Integer>{
	List<CourseEntity> findById(int courseId);
}