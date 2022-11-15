package com.smi.trainingcenter.dropdown.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "login")
public class LoginDropBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="loginid")
	private String id;
	@Column(name="userid")
	private String userId;
	@Column(name = "userpassword")
	private String userPassword;
	@Column(name = "userrole")
	private String userRole;
	@Column(name="active")
	private boolean active;
	//private Set<StaffExperienceDropBean> staffExperience = new HashSet<StaffExperienceDropBean>(0);
	public LoginDropBean(String userId, Set<StaffExperienceDropBean> staffExperience) {
		super();
		this.userId = userId;
		//this.staffExperience = staffExperience;
	}
	public LoginDropBean() {
		super();
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
	/*
	 * @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy =
	 * "login") public Set<StaffExperienceDropBean> getStaffExperience() { return
	 * staffExperience; } public void
	 * setStaffExperience(Set<StaffExperienceDropBean> staffExperience) {
	 * this.staffExperience = staffExperience; }
	 */
	
	
}
