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


@Entity
@Table(name= "topic")
public class TopicDropBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseid", nullable = false)
	private CourseDropBean course;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "topicid")
	private int id;

	@Column(name = "topicname")
	private String name;

	@Column(name = "duration")
	private String duration;

	@Column(name = "topicdescription")
	private String topicDescription;

	public TopicDropBean(CourseDropBean course, String name) {
		super();
		this.course = course;
		this.name = name;
	}

	public TopicDropBean() {
		super();
	}

	public CourseDropBean getCourse() {
		return course;
	}

	public void setCourse(CourseDropBean course) {
		this.course = course;
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
