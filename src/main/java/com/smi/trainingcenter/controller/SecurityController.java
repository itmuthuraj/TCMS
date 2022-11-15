package com.smi.trainingcenter.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smi.trainingcenter.dropdown.serviceImpl.LoginDropService;
import com.smi.trainingcenter.dropdown.serviceImpl.StaffDropServiceImpl;
import com.smi.trainingcenter.model.ComplaintBean;
import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.model.Login;
import com.smi.trainingcenter.model.TotalStudentBean;
import com.smi.trainingcenter.repository.LoginRepository;
import com.smi.trainingcenter.service.ComplaintService;
import com.smi.trainingcenter.service.CourseService;
import com.smi.trainingcenter.service.MyUserDetailService;

@Controller
public class SecurityController {
	@Autowired
	LoginRepository repo;
	
	
	@Autowired
	private MyUserDetailService service;

	@Autowired
	private ComplaintService complaintservice;

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private LoginDropService loginDropService;
//	@RequestMapping("/")
//	public String allusers() {
//		return "index";
//	}

	@RequestMapping("/CourseReg")
	public String alluser() {
		return "CourseReg";
	}

	@GetMapping("/index")
	public String checkUser() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");
		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");
		return "LoginPage";
	}
	/*
	 * @RequestMapping("/LoginPage") public String LoginPage() { return "LoginPage";
	 * }
	 */

	@RequestMapping("/home")
	public String index2(HttpServletRequest request, Authentication authentication) {
		HttpSession session = request.getSession();
		String a = authentication.getName(); 
		Optional<Login> bean = repo.findByUserName(authentication.getName());
		String rol = bean.get().getRoles();
		if (rol.equals("ROLE_ADMIN")) {
			session.setAttribute("sess", authentication.getName());
			return "redirect:/AdminDashboard";
		}

		else if (rol.equals("ROLE_MENTOR")) {
			
			 String sess = loginDropService.getNameWithLogin(a);
			  session.setAttribute("sess", sess );
			 
			return "redirect:/staffindex";
		} else if (rol.equals("student")) {
			 String sess = loginDropService.getStudentWithLogin(a);
			  session.setAttribute("sess", sess );
			return "redirect:/userindex";
		}

		return "index2";
	}

	/*
	 * @RequestMapping("/staffindex") public String index3(HttpServletRequest
	 * request, Authentication authentication) { HttpSession session =
	 * request.getSession(); session.setAttribute("sess", authentication.getName());
	 * 
	 * Optional<Login> bean = repo.findByUserName(authentication.getName()); String
	 * rol=bean.get().getRoles(); if(rol.equals("ROLE_MENTOR")) { return (""); }
	 * return "staffindex"; }
	 */
//
//	@RequestMapping("/index")
//	public String index() {
//		return "index";
//	}

	/*
	 * @RequestMapping("/staffexam") public String staffexam(Model model) {
	 * List<ExamBean> list = examservice.viewCourse();
	 * model.addAttribute("examlist", list); return "staffexam"; }
	 */

	@RequestMapping("/staffcourseschedule")
	public String staffcourseschedule() {
		return "staffcourseschedule";
	}

	@RequestMapping("/staffviewattendance")
	public String staffviewattendance() {
		return "staffviewattendance";
	}

	@RequestMapping("/bootintex")
	public String homepage() {
		return "bootintex";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/signup")
	public String signup() {
		return "signup";
	}

	@RequestMapping("/staffindex")
	public String staffindex() {
		return "staffindex";
	}



	@RequestMapping("/takeattendance")
	public String takeattendance() {
		return "takeattendance";
	}

	@RequestMapping("/AdminIdcard")
	public String idcard() {
		return "AdminIdcard";
	}


	@RequestMapping("/viewperformance")
	public String viewperformance() {
		return "viewperformance";
	}

	@RequestMapping("/viewcomplaint")
	public String viewcomplaint() {
		return "viewcomplaint";
	}

	@RequestMapping("/userindex")
	public String userindex() {
		return "userindex";
	}

	@RequestMapping("/usernav")
	public String usernav() {
		return "usernav";
	}

	@RequestMapping("/Courses")
	public String Courses() {
		return "Courses";
	}

	@RequestMapping("/stafftotalstudents")
	public String viewhomepage(Model model) {
		return findPaginated(model, "studentName", "asc");
	}

	@GetMapping("{sortField}")
	public String findPaginated(Model model, @PathVariable(value = "sortField") String sortField,
			@RequestParam("sortDir") String sortDir) {
		Page<TotalStudentBean> page = service.findPaginated(sortField, sortDir);
		int totalemp = page.getNumberOfElements();
		List<TotalStudentBean> emplist = page.getContent();
		model.addAttribute("totalemp", totalemp);
		model.addAttribute("EmployeeList", emplist);
		//model.addAttribute("sortField", sortField);
		//model.addAttribute("sortDir", sortDir);
		//model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		return "stafftotalstudents";
	}

	@GetMapping("/EmployeeList")
	public String getemployee(Model model, String keyword) {
		if (keyword != null) {
			Page<TotalStudentBean> page = service.getAllEmployee();
			int totalemp = page.getNumberOfElements();
			model.addAttribute("totalemp", totalemp);
			model.addAttribute("EmployeeList", service.findByKeyword(keyword));
		} else {
			model.addAttribute("EmployeeList", service.getAllEmployee());
		}
		return "stafftotalstudents";
	}

	/**************** Attendance Taking Page **************/

	@GetMapping("/staffindex")
	public String totalemployeeindex(Model model, String keyword) {
		Page<TotalStudentBean> page = service.getAllEmployee();
		int totalemp = page.getNumberOfElements();
		model.addAttribute("totalemp", totalemp);
		model.addAttribute("EmployeeList", service.getAllEmployee());
		return "staffindex";
	}

	/************ Admin Page **************/

	@RequestMapping("/AdminDashboard")
	public String managerindex() {
		return "AdminDashboard";
	}

}
