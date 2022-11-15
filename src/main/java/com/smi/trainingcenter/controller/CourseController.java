package com.smi.trainingcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/insertadmincourse")
	public String insertCourse(@ModelAttribute("course") Course course, Model model) {
		courseService.insertCourseValue(course);
		return "redirect:/AdminAddCourse";
	}

	@GetMapping("/api/course/{courseId}")
	public Course findCourseById(@PathVariable("courseId") String id) {
		return courseService.selectId(id);
	}

}
