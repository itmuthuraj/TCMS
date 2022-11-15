package com.smi.trainingcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.smi.trainingcenter.model.StudentEnquiry;
import com.smi.trainingcenter.repository.BatchRepository;
import com.smi.trainingcenter.repository.StudentEnquiryRepository;

@Service
public class StudentEnquiryService {
	@Autowired
	StudentEnquiryRepository studentEnquiryRepository;
	@Autowired
	BatchRepository batchRepository;

	public List<StudentEnquiry> getAllStudents() {
		return studentEnquiryRepository.findAll();
	}

	public void insertStudent(String course, StudentEnquiry enquiry) {
		String i = batchRepository.getBatchId(course);
		enquiry.setBatchId(i);
		studentEnquiryRepository.save(enquiry);
	}

}
