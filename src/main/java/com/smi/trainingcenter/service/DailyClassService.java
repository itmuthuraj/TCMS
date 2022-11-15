package com.smi.trainingcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.model.DailyClass;
import com.smi.trainingcenter.repository.BatchRepository;
import com.smi.trainingcenter.repository.DailyClassRepository;
import com.smi.trainingcenter.repository.StaffRepository;
import com.smi.trainingcenter.repository.TopicRepository;

@Service
public class DailyClassService {
	@Autowired
	DailyClassRepository dailyClassRepository;
	@Autowired
	BatchRepository batchRepository;
	@Autowired
	StaffRepository staffRepository;
	@Autowired
	TopicRepository topicRepository;

	public void insertInto(String batchId, int topicId, int staffId, String date) {
		DailyClass dailyClass = new DailyClass();
		dailyClass.setBatchId(batchId);
		dailyClass.setClassDate(date);
		dailyClass.setStaffId(staffId);
		dailyClass.setTopicId(topicId);
		this.dailyClassRepository.save(dailyClass);
		// TODO Auto-generated method stub

	}
}
