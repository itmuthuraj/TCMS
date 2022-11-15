package com.smi.trainingcenter.model;

public class StaffEntity {

	private static final long serialVersionUID = 1L;
	private int staffId;
	private String staffName;

	public StaffEntity(int staffId, String staffName) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
	}

	public StaffEntity() {
		super();
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

}
