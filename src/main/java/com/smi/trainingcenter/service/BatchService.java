package com.smi.trainingcenter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.tomcat.util.log.SystemLogHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.smi.trainingcenter.model.Batch;
import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.model.Staff;
import com.smi.trainingcenter.model.Topic;
import com.smi.trainingcenter.repository.BatchRepository;
import com.smi.trainingcenter.repository.CourseRepository;

@Service
public class BatchService {

	@Autowired
	BatchRepository batchRepository;

	@Autowired
	CourseRepository courseRepository;

	public String insertBatchValue(Batch batch) {

		System.out.printf(batch.getBatchStartDate(), batch.getCourseId());
		return "";
	}

	public void insertInto(String course, String date) {
		String g = courseRepository.getCourseIdWithName(course);
		Batch batch = new Batch();
		batch.setCourseId(course);
		String i = batchRepository.getBatchIdAuto(date, course);
		batch.setBatchId(i);
		int a = i.length();
		String b = i.substring(7, a);
		String d = g.toUpperCase() + "_Batch_" + b;
		batch.setBatchName(d);
		batch.setBatchStartDate(date);
		this.batchRepository.save(batch);
	}

	public List<Batch> viewBatch() {
		return batchRepository.findAll();
	}

	public String viewCourseWithBatch(String batchId) {
		return this.batchRepository.getCourseIdWithBatch(batchId);
	}

	public String getBatchIdByCourse(String courseName) {
		return this.batchRepository.getBatchId(courseName);
	}
	/*
	 * public List<BatchEntity> viewBatchWithCourse(String courseId) { return
	 * batchRepository.findBatchOfCourse(courseId); }
	 */

}
