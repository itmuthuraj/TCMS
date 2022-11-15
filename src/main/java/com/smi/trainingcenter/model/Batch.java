package com.smi.trainingcenter.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "batch")

public class Batch {
	private static final long serialVersionUID = 1l;
	@Id
	@Column(name = "batchid")
	private String batchId;
	@Column(name = "batchname")
	private String batchName;
	@Column(name = "batchstartdate")
	private String batchStartDate;
	@Column(name = "courseid")
	private String courseId;

	
	
	public Batch() {
		super();
	}

	public Batch(String batchName, String courseId) {
		super();
		this.batchName = batchName;
		this.courseId = courseId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
