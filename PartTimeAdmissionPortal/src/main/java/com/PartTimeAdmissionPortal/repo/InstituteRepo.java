package com.PartTimeAdmissionPortal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PartTimeAdmissionPortal.entity.InstituteEntity;



public interface InstituteRepo extends JpaRepository<InstituteEntity, Integer> {
	List<InstituteEntity> findById(int instituteId);

	//void save(InstituteEntity iEntity);
}
