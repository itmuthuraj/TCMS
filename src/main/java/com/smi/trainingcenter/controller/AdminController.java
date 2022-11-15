package com.smi.trainingcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smi.trainingcenter.model.Batch;
import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.model.Staff;
import com.smi.trainingcenter.model.StudentEnquiry;
import com.smi.trainingcenter.service.BatchService;
import com.smi.trainingcenter.service.CourseService;
import com.smi.trainingcenter.service.StaffService;
import com.smi.trainingcenter.service.StudentEnquiryService;

@Controller
public class AdminController {
	@Autowired
	CourseService courseService;
	@Autowired
	StaffService staffService;
	@Autowired
	StudentEnquiryService enquiryService;
	@Autowired
	BatchService batchService;

	@RequestMapping("/Adminviewstudents")
	public String viewstudent(Model model) {
		List<StudentEnquiry> studentlist = enquiryService.getAllStudents();
		model.addAttribute("studentlist", studentlist);
		return "Adminviewstudents";
	}

	@RequestMapping("/AdminAddStaff")
	public String AddStaff(Model model) {
		List<Course> courseInfo = courseService.viewCourseNames();
		model.addAttribute("courseInfo", courseInfo);
		return "AdminAddStaff";
	}

	@RequestMapping("/AdminAddStudent")
	public String AddStudent(Model model) {
		List<Course> courseInfo = courseService.viewCourseNames();
		model.addAttribute("courseInfo", courseInfo);
		return "AdminAddStudent";
	}

	@RequestMapping("/Adminviewstaff")
	public String viewstaff(Model model) {
		List<Staff> stafflist = staffService.getAllStaffs();
		model.addAttribute("stafflist", stafflist);
		return "Adminviewstaff";
	}

	@RequestMapping("/AdminAddCourse")
	public String AddCourse() {
		return "AdminAddCourse";
	}

	@RequestMapping("/AdminAddBatch")
	public String AddBatch(Model model) {

		List<Course> courseInfo = courseService.viewCourseNames();
		model.addAttribute("courseInfo", courseInfo);
		return "AdminAddBatch";
	}

	@RequestMapping("/AdminViewCourse")
	public String viewcourse(Model model) {
		List<Course> courselist = courseService.viewCourseNames();
		model.addAttribute("courselist", courselist);
		return "AdminViewCourse";
	}

	@RequestMapping("/AdminViewBatch")
	public String viewBatch(Model model) {
		List<Batch> batchlist = batchService.viewBatch();
		model.addAttribute("batchlist", batchlist);
		return "AdminViewBatch";
	}
}
