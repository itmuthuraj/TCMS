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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class CourseDropBean implements Serializable {

	private static final long serialVersionUID =1L;
	private String id;
	private String name;
	private String courseDescription;
	private Double fees;
	private Set<BatchDropBean> batchDrop = new HashSet<BatchDropBean>(0);
	private Set<StaffDropBean> staffDrop = new HashSet<StaffDropBean>(0);
	private Set<TopicDropBean> topicDrop = new HashSet<TopicDropBean>(0);
	public CourseDropBean(String name,Set<TopicDropBean> topicDrop, Set<BatchDropBean> batchDrop,Set<StaffDropBean> staffDrop) {
		super();
		this.topicDrop=topicDrop;
		this.name = name;
		this.batchDrop = batchDrop;
		this.staffDrop = staffDrop;
	}
	public CourseDropBean() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseId", unique = true, nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "courseName", nullable = false, length = 250)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "courseDescription", nullable = false, length = 250)
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	@Column(name = "fees", nullable = false, length = 250)
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "course")
	public Set<BatchDropBean> getBatchDrop() {
		return batchDrop;
	}
	public void setBatchDrop(Set<BatchDropBean> batchDrop) {
		this.batchDrop = batchDrop;
	}
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "course")
	public Set<StaffDropBean> getStaffDrop() {
		return staffDrop;
	}
	public void setStaffDrop(Set<StaffDropBean> staffDrop) {
		this.staffDrop = staffDrop;
	}
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "course")
	public Set<TopicDropBean> getTopicDrop() {
		return topicDrop;
	}
	public void setTopicDrop(Set<TopicDropBean> topicDrop) {
		this.topicDrop = topicDrop;
	}
	
}
