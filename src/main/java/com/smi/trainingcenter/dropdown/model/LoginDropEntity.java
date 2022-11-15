package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;

import javax.persistence.Column;

public class LoginDropEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String userId;
	private String userPassword;
	private String userRole;
	private boolean active;
	public LoginDropEntity(String id, String userId) {
		super();
		this.id = id;
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

}
