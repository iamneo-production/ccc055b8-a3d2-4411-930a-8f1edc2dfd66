package com.PartTimeAdmissionPortal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Institute")
public class InstituteEntity {
	
	@Id
	@GeneratedValue
	private int instituteId;
	private String instituteName;
	private String instituteDescription;
	private String instituteAddress;
	private int instituteNum;
	private String instituteEmail;
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteDescription() {
		return instituteDescription;
	}
	public void setInstituteDescription(String instituteDescription) {
		this.instituteDescription = instituteDescription;
	}
	public String getInstituteAddress() {
		return instituteAddress;
	}
	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}
	public int getInstituteNum() {
		return instituteNum;
	}
	public void setInstituteNum(int instituteNum) {
		this.instituteNum = instituteNum;
	}
	public String getInstituteEmail() {
		return instituteEmail;
	}
	public void setInstituteEmail(String instituteEmail) {
		this.instituteEmail = instituteEmail;
	}
	@Override
	public String toString() {
		return "InstituteEntity [instituteId=" + instituteId + ", instituteName=" + instituteName
				+ ", instituteDescription=" + instituteDescription + ", instituteAddress=" + instituteAddress
				+ ", instituteNum=" + instituteNum + ", instituteEmail=" + instituteEmail + "]";
	}
	
	public InstituteEntity() {
		super();
	}
	

}
