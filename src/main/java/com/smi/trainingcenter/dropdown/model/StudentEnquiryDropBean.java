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
import javax.persistence.Table;

import com.smi.trainingcenter.model.Batch;

@Entity
@Table(name = "studentenquiry")
public class StudentEnquiryDropBean implements Serializable{

	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentenquiryid")
	private int id;
	@Column(name = "studentname")
	private String studentName;
	@Column(name = "studentaddress")
	private String studentAddress;
	@Column(name = "mailid")
	private String mailId;
	@Column(name = "studentmobile")
	private String studentMobile;
	@Column(name = "dateofbirth")
	private String dateOfBirth;
	@Column(name = "gender")
	private String gender;
	@Column(name="batchid")
	private BatchDropBean batch;
	@Column(name = "studentqualification")
	private String studentQualification;
	@Column(name = "department")
	private String department;
	@Column(name = "yearofpassing")
	private String yearOfPassing;
	@Column(name = "institute")
	private String institute;
	public StudentEnquiryDropBean(String studentName, BatchDropBean batch) {
		super();
		this.studentName = studentName;
		this.batch = batch;
	}
	public StudentEnquiryDropBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchid", nullable = false)
	public BatchDropBean getBatch() {
		return batch;
	}
	public void setBatch(BatchDropBean batch) {
		this.batch = batch;
	}
	public String getStudentQualification() {
		return studentQualification;
	}
	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	
	
}
