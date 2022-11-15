package com.smi.trainingcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Topic")
public class Topic {
	private static final int serialVersionUID = 1;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "topicid")
	private int topicId;
	@Column(name = "courseid")
	private String courseId;
	@Column(name = "topicname")
	private String topicName;
	@Column(name = "duration")
	private String duration;
	@Column(name = "topicdescription")
	private String topicDescription;
	

	/*
	 * public Topic() { super(); }
	 * 
	 * public Topic(String courseId, String topicName) { super(); this.courseId =
	 * courseId; this.topicName = topicName; }
	 */
	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
}
