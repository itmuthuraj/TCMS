package com.smi.trainingcenter.dropdown.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.dropdown.model.StaffDropEntity;
import com.smi.trainingcenter.dropdown.repository.StaffDropRepository;

@Service("staffDropService")
public class StaffDropServiceImpl implements StaffDropService{
	@Autowired
	private StaffDropRepository staffDropRepository;

	@Override
	public List<StaffDropEntity> findByCourse(String id) {
		// TODO Auto-generated method stub
		return staffDropRepository.findByCourse(id);
	}

	@Override
	public ArrayList<Object[]> viewStaffProfile(String userId) {
		// TODO Auto-generated method stub
		return staffDropRepository.viewStaffProfile(userId);
	}
	
}
