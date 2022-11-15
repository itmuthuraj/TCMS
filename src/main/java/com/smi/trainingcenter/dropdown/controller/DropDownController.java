package com.smi.trainingcenter.dropdown.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.smi.trainingcenter.dropdown.serviceImpl.BatchDropService;
import com.smi.trainingcenter.dropdown.serviceImpl.CourseDropService;
import com.smi.trainingcenter.dropdown.serviceImpl.StaffDropService;
import com.smi.trainingcenter.dropdown.serviceImpl.TopicDropService;
import com.smi.trainingcenter.service.DailyClassService;


@Controller
@RequestMapping(value = { "", "demo" })
public class DropDownController {
	@Autowired
	private CourseDropService courseDropService;

	@Autowired
	private BatchDropService batchDropService;
	
	@Autowired
	private TopicDropService topicDropService;
	
	@Autowired
	private StaffDropService staffDropService;
	
	@Autowired
	private DailyClassService dailyClassService;

	@RequestMapping(value= "/DailyClass", method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("courses", courseDropService.findAll());
		return "DailyClass";
	}

	@ResponseBody
	@RequestMapping(value = "loadBatchByCourse/{id}", method = RequestMethod.GET)
	public String loadBatchByCourse(@PathVariable("id") String id) {
		Gson gson = new Gson();
		return gson.toJson(batchDropService.findByCourse(id));
	}
	
	@ResponseBody
	@RequestMapping(value = "loadTopicByCourse/{id}", method = RequestMethod.GET)
	public String loadTopicByCourse(@PathVariable("id") String id) {
		Gson gson = new Gson();
		return gson.toJson(topicDropService.findByCourse(id));
	}
	
	@ResponseBody
	@RequestMapping(value = "loadStaffByCourse/{id}", method = RequestMethod.GET)
	public String loadStaffByCourse(@PathVariable("id") String id) {
		Gson gson = new Gson();
		return gson.toJson(staffDropService.findByCourse(id));
	}
	
	@GetMapping("/insertdailyclass")
	public String insertDailyClass(@RequestParam("batchId") String batchId, @RequestParam("topicId") int topicId,
			@RequestParam("staffId") int staffId, @RequestParam("classDate") String classDate,
			Model model) {
		dailyClassService.insertInto(batchId, topicId, staffId, classDate);
		return "redirect:/DailyClass";
	}
	
}