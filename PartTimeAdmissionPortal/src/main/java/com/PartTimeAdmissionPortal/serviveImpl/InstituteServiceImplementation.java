package com.PartTimeAdmissionPortal.serviveImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PartTimeAdmissionPortal.entity.InstituteEntity;
import com.PartTimeAdmissionPortal.repo.InstituteRepo;
import com.PartTimeAdmissionPortal.service.InstituteService;

@Service
public class InstituteServiceImplementation implements InstituteService {

	@Autowired
	private InstituteRepo ir;
	
	@Override
	public void addInstituteService(InstituteEntity iEntity) {
		ir.save(iEntity);
	}

	@Override
	public void deleteInstituteService(int id, int instituteId) {
		if(ir.findById(id)!=null) {
			ir.deleteById(id);
		}
		
	}

	@Override
	public List<InstituteEntity> viewInstituteService(int instituteId) {
		return ir.findById(instituteId);
	}

	@Override
	public void editCourseService(InstituteEntity iEntity, int instituteId) {
		InstituteEntity temp = new InstituteEntity();
		temp.setInstituteId(iEntity.getInstituteId());
		temp.setInstituteName(iEntity.getInstituteName());
		temp.setInstituteDescription(iEntity.getInstituteDescription());
		temp.setInstituteAddress(iEntity.getInstituteAddress());
		temp.setInstituteNum(iEntity.getInstituteNum());
		temp.setInstituteEmail(iEntity.getInstituteEmail());
		
		ir.save(temp);
		
	}
}
