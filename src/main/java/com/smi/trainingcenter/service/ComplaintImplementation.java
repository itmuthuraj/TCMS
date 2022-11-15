package com.smi.trainingcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.model.ComplaintBean;
import com.smi.trainingcenter.repository.ComplaintRepository;

@Service
public class ComplaintImplementation implements ComplaintService {

	@Autowired
	public ComplaintRepository complaintrepository;

	@Override
	public List<ComplaintBean> viewCourse() {
		return complaintrepository.findAll();
	}

}
