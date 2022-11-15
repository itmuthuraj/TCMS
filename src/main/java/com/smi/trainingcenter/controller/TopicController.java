package com.smi.trainingcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.service.CourseService;
import com.smi.trainingcenter.service.TopicService;

@Controller
public class TopicController {
	@Autowired
	TopicService topicService;
	@Autowired
	CourseService courseService;

	/*
	 * @RequestMapping("/TopicReg") public String insertTopic(Model model) {
	 * List<Course> courseInfo = courseService.viewCourseNames();
	 * model.addAttribute("courseInfo", courseInfo); return "TopicReg"; }
	 */

	@PostMapping("/insertTopic")
	public String inserting(@RequestParam("courseId") String course, @RequestParam("topicName") String topicName,
			@RequestParam("duration") String duration, @RequestParam("topicDescription") String topicDescription,
			Model model) {
		topicService.insertValue(course, duration, topicDescription, topicName);
		return "redirect:/CourseTopic";
	}
	
	
	
}
