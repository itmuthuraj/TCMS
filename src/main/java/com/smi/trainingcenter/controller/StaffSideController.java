package com.smi.trainingcenter.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smi.trainingcenter.dropdown.serviceImpl.LoginDropService;
import com.smi.trainingcenter.model.ComplaintBean;
import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.service.ComplaintService;
import com.smi.trainingcenter.service.CourseService;
import com.smi.trainingcenter.service.TopicService;

@Controller
public class StaffSideController {
	@Autowired
	private ComplaintService complaintservice;

	@Autowired
	private CourseService courseService;

	@Autowired
	private TopicService topicService;
	
	@Autowired
	private LoginDropService loginDropService;

	@RequestMapping("/stafftakeattendance")
	public String stafftakeattendance() {
		return "stafftakeattendance";
	}

	@RequestMapping("/stafftaskassign")
	public String stafftaskassign() {
		return "stafftaskassign";
	}

	@RequestMapping("/CourseTopic")
	public String CourseTopic(HttpSession session, Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String s = loginDropService.getNameWithLogin(auth.getName());
		System.out.println(s);
		List<Course> courseInfo = courseService.viewCourseNames();
		model.addAttribute("courseInfo", courseInfo);
		model.getAttribute(session.getId());
		return "CourseTopic";
	}

	/*
	 * @RequestMapping(value = "/viewCourseTopic", method=RequestMethod.GET) public
	 * String viewCourseTopic(Model model) { ArrayList<String> topicView =
	 * (ArrayList<String>) topicService.viewTopicWith();
	 * model.addAttribute("topicView", topicView); return "viewCourseTopic"; }
	 */

	@RequestMapping("/staffmark")
	public String staffmark() {
		return "staffmark";
	}
	@RequestMapping("/staffexam")
	public String staffexam() {
		return "staffexam";
	}
	
	/*
	 * @RequestMapping("/viewstaffprofile") public String viewStaffProfile() {
	 * return "viewstaffprofile"; }
	 */
	
	@RequestMapping("/staffaddperformance")
	public String staffaddperformance() {
		return "staffaddperformance";
	}
	/*
	 * @RequestMapping("/viewCourseTopic") public String viewCourseTopic() { return
	 * "viewCourseTopic"; }
	 */

	@RequestMapping("/staffviewcomplaint")
	public String staffviewcomplaint(Model model) {
		List<ComplaintBean> list = complaintservice.viewCourse();
		model.addAttribute("complaintlist", list);
		return "staffviewcomplaint";
	}

	/*
	 * @RequestMapping(value="/DailyClass", method=RequestMethod.GET) public String
	 * addDailyClass(ModelMap modelMap) { modelMap.put("courseInfo",
	 * courseService.viewCourseNames()); return "DailyClass"; }
	 */
}
