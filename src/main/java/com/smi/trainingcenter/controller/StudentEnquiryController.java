package com.smi.trainingcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.smi.trainingcenter.model.StudentEnquiry;
import com.smi.trainingcenter.service.StudentEnquiryService;

@Controller
public class StudentEnquiryController {
	@Autowired
	StudentEnquiryService studentEnquiryService;

	@GetMapping("/insertadminstudent")
	public String insertStudentEnquiry(@RequestParam("courseName") String course,
			@RequestParam("dateOfBirth") String dateOfBirth, @ModelAttribute("student") StudentEnquiry student,
			Model model) {
		studentEnquiryService.insertStudent(course, student);
		return "redirect:/AdminAddStudent";

	}

}
