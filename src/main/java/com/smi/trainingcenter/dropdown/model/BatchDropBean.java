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
import javax.persistence.Table;

@Entity
@Table(name= "batch")
public class BatchDropBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String batchStartDate;
	private CourseDropBean course;
	private Set<StudentEnquiryDropBean> studentEnquiryDrop = new HashSet<StudentEnquiryDropBean>(0);
	public BatchDropBean(String name, CourseDropBean course,Set<StudentEnquiryDropBean> studentEnquiryDrop) {
		super();
		this.name = name;
		this.course = course;
		this.studentEnquiryDrop = studentEnquiryDrop;
	}
	public BatchDropBean() {
		super();
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "batchId", unique = true, nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "batchName", nullable = false, length = 250)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "batchstartdate", nullable = false, length = 250)
	public String getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseid", nullable = false)
	public CourseDropBean getCourse() {
		return course;
	}
	public void setCourse(CourseDropBean course) {
		this.course = course;
	}
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "batch")
	public Set<StudentEnquiryDropBean> getStudentEnquiryDrop() {
		return studentEnquiryDrop;
	}
	public void setStudentEnquiryDrop(Set<StudentEnquiryDropBean> studentEnquiryDrop) {
		this.studentEnquiryDrop = studentEnquiryDrop;
	}
	
}
