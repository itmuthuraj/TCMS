package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;

import javax.persistence.Column;

public class TopicDropEntity implements Serializable{

	private static final long serialVersionUID = 1L;	
	private int id;
	private String name;
	private String duration;
	private String topicDescription;
	public TopicDropEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
