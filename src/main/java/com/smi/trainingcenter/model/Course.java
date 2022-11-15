package com.smi.trainingcenter.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "courseid")
	String courseId;
	@Column(name = "coursename")
	String courseName;
	@Column(name = "coursedescription")
	String courseDescription;
	@Column(name = "fees")
	Double fees;

	/*
	 * public Course(String courseId) { this.courseId = courseId; }
	 * 
	 * public Course(String courseName, Set<BatchDrop> batchDrop) { this.courseName
	 * = courseName; this.batchDrop = batchDrop; }
	 */
	/* private Set<BatchDrop> batchDrop = new HashSet<BatchDrop>(0); */

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "course") public Set<BatchDrop>
	 * getBatchDrop() { return this.batchDrop; }
	 * 
	 * public void setBatchDrop(Set<BatchDrop> batchDrop) { this.batchDrop =
	 * batchDrop; }
	 */

}
