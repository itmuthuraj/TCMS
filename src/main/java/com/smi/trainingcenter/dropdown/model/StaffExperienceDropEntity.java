package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;

public class StaffExperienceDropEntity implements Serializable {
	

	private static final long serialVersionUID = 1L;	
	private int id;
	private int yearOfExperience;
	private String previousCompanyWorked;
	private String staffQualification;
	public StaffExperienceDropEntity(int id, String previousCompanyWorked) {
		super();
		this.id = id;
		this.previousCompanyWorked = previousCompanyWorked;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getPreviousCompanyWorked() {
		return previousCompanyWorked;
	}
	public void setPreviousCompanyWorked(String previousCompanyWorked) {
		this.previousCompanyWorked = previousCompanyWorked;
	}
	public String getStaffQualification() {
		return staffQualification;
	}
	public void setStaffQualification(String staffQualification) {
		this.staffQualification = staffQualification;
	}
	

}
