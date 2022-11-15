package com.smi.trainingcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentenquiry")
public class TotalStudentBean {

	@Id
	@Column(name = "studentenquiryid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StudentEnquiryId;

	@Column(name = "studentname")
	private String studentName;

	@Column(name = "mailid")
	private String mail;

	@Column(name = "studentmobile")
	private String mobile;

	public int getStudentEnquiryId() {
		return StudentEnquiryId;
	}

	public void setStudentEnquiryId(int studentEnquiryId) {
		StudentEnquiryId = studentEnquiryId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
