package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;

public class BatchDropEntity implements Serializable{

	private static final long serialVersionUID = 1L;	
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String batchStartDate;
	public String getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public BatchDropEntity(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public BatchDropEntity() {
		super();
	}
	
	
}
