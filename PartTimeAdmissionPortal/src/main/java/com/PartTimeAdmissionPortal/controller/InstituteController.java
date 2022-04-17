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

import com.PartTimeAdmissionPortal.entity.InstituteEntity;
import com.PartTimeAdmissionPortal.service.InstituteService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins="*")
public class InstituteController {
	
	@Autowired
	private InstituteService iS;
	
	private int instituteId = 0;
	
	@PostMapping("/addInstitute")
	public void addInstitute(@RequestBody InstituteEntity ie) {
		InstituteEntity ie1 = new InstituteEntity();
		ie1.setInstituteId(ie.getInstituteId());
		ie1.setInstituteName(ie.getInstituteName());
		ie1.setInstituteDescription(ie.getInstituteDescription());
		ie1.setInstituteAddress(ie.getInstituteAddress());
		ie1.setInstituteNum(ie.getInstituteNum());
		ie1.setInstituteEmail(ie.getInstituteEmail());
		
		iS.addInstituteService(ie1);
	}
	
	@GetMapping("/viewInstitute")
	public List<InstituteEntity> viewInstitute(){
		return iS.viewInstituteService(0);
	}
	
	@GetMapping("/deleteInstitute")
	public void deleteInstitute(@RequestParam int id) {
		iS.deleteInstituteService(id, this.instituteId);
	}
	
	@PostMapping("/editInstitute")
	public void editInstitute(@RequestBody InstituteEntity ie) {
		InstituteEntity ie2 = new InstituteEntity();
		
		ie2.setInstituteId(ie.getInstituteId());
		ie2.setInstituteName(ie.getInstituteName());
		ie2.setInstituteDescription(ie.getInstituteDescription());
		ie2.setInstituteAddress(ie.getInstituteAddress());
		ie2.setInstituteNum(ie.getInstituteNum());
		ie2.setInstituteEmail(ie.getInstituteEmail());
		
		iS.editCourseService(ie2, this.instituteId);
	}
}
	
