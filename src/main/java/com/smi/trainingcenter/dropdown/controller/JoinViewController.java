package com.smi.trainingcenter.dropdown.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smi.trainingcenter.dropdown.serviceImpl.LoginDropService;
import com.smi.trainingcenter.dropdown.serviceImpl.StaffDropService;
import com.smi.trainingcenter.dropdown.serviceImpl.StudentDropService;
import com.smi.trainingcenter.dropdown.serviceImpl.TopicDropService;

@Controller
public class JoinViewController {
	@Autowired
	private TopicDropService topicDropService;
	@Autowired
	private LoginDropService loginDropService;
	@Autowired
	private StaffDropService staffDropService;
	@Autowired
	private StudentDropService studentDropService;

	@RequestMapping(value = "/viewCourseTopic", method = RequestMethod.GET)
	public String viewCourseTopic(Model model) {
		ArrayList<Object[]> topicView =  topicDropService.viewTopicByCourseName();
		//System.out.println(topicView.size());
		model.addAttribute("topicView", topicView);
		return "viewCourseTopic";
	}
	
	@RequestMapping(value="/viewstaffprofile", method = RequestMethod.GET)
	public String viewStaffProfile(HttpSession session, Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String s = auth.getName();
		System.out.println(s);
		ArrayList<Object[]> topicView =  staffDropService.viewStaffProfile(s);
		model.addAttribute("topicView", topicView);
		return "viewstaffprofile";
	}
	
	@RequestMapping(value="/viewstudentprofile", method=RequestMethod.GET)
	public String viewStudentProfile(HttpSession session, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String s = auth.getName();
		ArrayList<Object[]> topicView =  studentDropService.viewStudentProfile(s);
		model.addAttribute("topicView", topicView);
		return "viewstudentprofile";
	}
	

}
