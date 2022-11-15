package com.smi.trainingcenter.dropdown.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.dropdown.model.CourseDropBean;
import com.smi.trainingcenter.dropdown.repository.CourseDropRepository;

@Service("courseDropService")
public class CourseDropServiceImpl implements CourseDropService{
	@Autowired
	private CourseDropRepository courseDropRepository;

	@Override
	public Iterable<CourseDropBean> findAll() {
		return courseDropRepository.findAll();
	}

	@Override
	public CourseDropBean find(String id) {
		return courseDropRepository.findById(id).get();
	}

}