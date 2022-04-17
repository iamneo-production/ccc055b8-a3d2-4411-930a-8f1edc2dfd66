package com.PartTimeAdmissionPortal.service;

import java.util.List;

import com.PartTimeAdmissionPortal.entity.InstituteEntity;


public interface InstituteService {
	
	public void deleteInstituteService(int id, int instituteId);
	public void addInstituteService(InstituteEntity instituteEntityObj);
	public List<InstituteEntity> viewInstituteService(int instituteId);
	public void editCourseService(InstituteEntity iEntity, int instituteId);

}
