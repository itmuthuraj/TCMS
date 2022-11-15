package com.smi.trainingcenter.dropdown.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.smi.trainingcenter.dropdown.model.StaffDropEntity;

public interface StaffDropService {
	public List<StaffDropEntity> findByCourse(String id);
	public ArrayList<Object[]> viewStaffProfile(String userId);
}
