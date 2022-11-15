package com.smi.trainingcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.model.Staff;
import com.smi.trainingcenter.model.StudentEnquiry;
import com.smi.trainingcenter.repository.StaffRepository;

@Service
public class StaffService {
	@Autowired
	StaffRepository staffRepository;

	public Staff selectStaffId(int staffId) {
		return staffRepository.findById(staffId).get();
	}

	public List<Staff> getAllStaffs() {
		return staffRepository.findAll();
	}

	public void deleteStaff(int id) {
		staffRepository.deleteById(id);
	}

	public void insertStaff(Staff enquiry) {
		staffRepository.save(enquiry);
	}

	/*
	 * public List<Staff> viewStaffWithCourse(String courseId) { List<Staff> list =
	 * (List<Staff>) staffRepository.findStaffOfCourse(courseId); return list; }
	 */

	public Staff selectId(int id) {
		return staffRepository.findById(id).get();
	}
}
