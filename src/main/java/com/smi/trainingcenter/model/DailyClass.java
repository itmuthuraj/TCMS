package com.smi.trainingcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dailyclass")
public class DailyClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dailyclassid")
	private int dailyClassId;
	@Column(name = "batchid")
	private String batchId;
	@Column(name = "topicid")
	private int topicId;
	@Column(name = "staffid")
	private int staffId;
	@Column(name = "classdate")
	private String classDate;

	public int getDailyClassId() {
		return dailyClassId;
	}

	public void setDailyClassId(int dailyClassId) {
		this.dailyClassId = dailyClassId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getClassDate() {
		return classDate;
	}

	public void setClassDate(String classDate) {
		this.classDate = classDate;
	}

}
