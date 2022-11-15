package com.smi.trainingcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smi.trainingcenter.model.Staff;
import com.smi.trainingcenter.model.StudentEnquiry;
import com.smi.trainingcenter.service.StaffService;
import com.smi.trainingcenter.service.StudentEnquiryService;

@Controller
public class StaffController {
	@Autowired
	StaffService staffService;

	@RequestMapping("/delete/{id}")
	public String deleteId(@PathVariable("id") int id, Model model) {
		staffService.deleteStaff(id);
		return "redirect:/Adminviewstaff";
	}

	@GetMapping("/insertadminstaff")
	public String insertStudentEnquiry(@RequestParam("courseId") String course, @ModelAttribute("staff") Staff staff,
			Model model) {
		staffService.insertStaff(staff);
		return "redirect:/AdminAddStaff";

	}
}
