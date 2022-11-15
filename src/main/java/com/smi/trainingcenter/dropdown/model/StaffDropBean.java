package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "staff")
public class StaffDropBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staffid")
	private int id;
	@Column(name = "staffname")
	private String name;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "mailid")
	private String mailId;
	@Column(name = "dateofbirth")
	private String dateOfBirth;
	@Column(name = "gender")
	private String gender;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseid", nullable = false)
	private CourseDropBean course;
	//private Set<StaffExperienceDropBean> staffExperienceDropBean = new HashSet<StaffExperienceDropBean>(0);
	
	public StaffDropBean() {
		super();
	}

	public StaffDropBean(String name,
			CourseDropBean course/* ,Set<StaffExperienceDropBean> staffExperienceDropBean */) {
		super();
		this.name = name;
		this.course = course;
		//this.staffExperienceDropBean = staffExperienceDropBean;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
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
	public CourseDropBean getCourse() {
		return course;
	}
	public void setCourse(CourseDropBean course) {
		this.course = course;
	}
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy =
	 * "staff") public Set<StaffExperienceDropBean> getStaffExperienceDropBean() {
	 * return staffExperienceDropBean; } public void
	 * setStaffExperienceDropBean(Set<StaffExperienceDropBean>
	 * staffExperienceDropBean) { this.staffExperienceDropBean =
	 * staffExperienceDropBean; }
	 */
}
