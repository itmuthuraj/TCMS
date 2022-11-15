package com.smi.trainingcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	public String insertCourseValue(Course course) {
		String id = courseRepository.getCourseIdAuto(course.getCourseName());
		course.setCourseId(id);
		this.courseRepository.save(course);
		return "";
	}

	public Course selectId(String id) {
		return courseRepository.findById(id).get();
	}

	public List<Course> viewCourseNames() {
		return courseRepository.findAll();
	}
}
