package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
@Table(name = "studentenrolment")
public class StudentEnrolmentDropBean implements Serializable{

	private static final long serialVersionUID =1L;
	@Id
	@Column(name = "studentenrolmentid")
	private int id;
	@Column(name = "dateofjoining")
	private String dateOfJoining;
	@Column(name = "feespaymentstatus")
	private boolean feesPaymentStatus;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="studentenquiryid", nullable = false)
	private StudentEnquiryDropBean student;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loginid", nullable = false)
	private LoginDropBean login;

	public StudentEnrolmentDropBean(int id,LoginDropBean login, StudentEnquiryDropBean student) {
		super();
		this.id = id;
		this.student = student;
		this.login = login;
	}
	
	public StudentEnrolmentDropBean() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public boolean isFeesPaymentStatus() {
		return feesPaymentStatus;
	}
	public void setFeesPaymentStatus(boolean feesPaymentStatus) {
		this.feesPaymentStatus = feesPaymentStatus;
	}
	public StudentEnquiryDropBean getStudent() {
		return student;
	}
	public void setStudent(StudentEnquiryDropBean student) {
		this.student = student;
	}
	public LoginDropBean getLogin() {
		return login;
	}

	public void setLogin(LoginDropBean login) {
		this.login = login;
	}
	
}
