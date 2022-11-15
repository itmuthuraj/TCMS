package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="staffexperience")
public class StaffExperienceDropBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="staffexperienceid")
	private int id;
	@Column(name="yearofexperience")
	private int yearOfExperience;
	@Column(name="previouscompanyworked")
	private String previousCompanyWorked;
	@Column(name = "staffqualification")
	private String staffQualification;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staffid", nullable = false)
	private StaffDropBean staff;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loginid", nullable = false)
	private LoginDropBean login;
	
	public StaffExperienceDropBean(int yearOfExperience, StaffDropBean staff,LoginDropBean login) {
		super();
		this.yearOfExperience = yearOfExperience;
		this.staff = staff;
		this.login = login;
	}
	public LoginDropBean getLogin() {
		return login;
	}
	public void setLogin(LoginDropBean login) {
		this.login = login;
	}
	public StaffExperienceDropBean() {
		super();
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
	public StaffDropBean getStaff() {
		return staff;
	}
	public void setStaff(StaffDropBean staff) {
		this.staff = staff;
	}
	
	
	
}
