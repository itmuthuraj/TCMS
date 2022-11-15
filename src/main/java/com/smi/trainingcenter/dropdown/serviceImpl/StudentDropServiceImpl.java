package com.smi.trainingcenter.dropdown.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.dropdown.repository.StudentDropRepository;

@Service("studentDropService")
public class StudentDropServiceImpl implements StudentDropService{
	@Autowired
	StudentDropRepository studentDropRepository;

	@Override
	public ArrayList<Object[]> viewStudentProfile(String userId) {
		// TODO Auto-generated method stub
		return studentDropRepository.viewStudentProfile(userId);
	}

}
