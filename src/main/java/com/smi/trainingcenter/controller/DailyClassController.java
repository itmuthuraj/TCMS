package com.smi.trainingcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.smi.trainingcenter.model.Batch;
import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.model.Staff;
import com.smi.trainingcenter.model.Topic;
import com.smi.trainingcenter.service.BatchService;
import com.smi.trainingcenter.service.DailyClassService;
import com.smi.trainingcenter.service.StaffService;
import com.smi.trainingcenter.service.TopicService;

@Controller
@RequestMapping(value = { "", "demo" })
public class DailyClassController {
	@Autowired
	DailyClassService dailyClassService;
	@Autowired
	BatchService batchService;
	@Autowired
	TopicService topicService;
	@Autowired
	StaffService staffService;

	/*
	 * @RequestMapping("/DailyClassReg") public String batchRegisteration(Model
	 * model) { // modelMap.put("batchInfo", batchService.viewBatch());
	 * 
	 * List<Batch> batchInfo = batchService.viewBatch();
	 * model.addAttribute("batchInfo", batchInfo);
	 * 
	 * List<Topic> topicInfo = topicService.viewTopic();
	 * model.addAttribute("topicInfo", topicInfo);
	 * 
	 * List<Staff> staffInfo = staffService.viewStaff();
	 * model.addAttribute("staffInfo", staffInfo);
	 * 
	 * return "DailyClassReg"; }
	 */
	/*
	 * @RequestMapping(value = "/loadBatchByCourse/{id}", method =
	 * RequestMethod.GET, produces = "application/json")
	 * 
	 * @ResponseBody public String loadBatchByCourse(@PathVariable("id") String id)
	 * { Gson gson = new Gson(); return
	 * gson.toJson(batchService.viewBatchWithCourse(id));
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/loadTopicByCourse/{id}", method =
	 * RequestMethod.GET, produces = "application/json")
	 * 
	 * @ResponseBody public String loadTopicByCourse(@PathVariable("id") String id)
	 * { Gson gson = new Gson(); return
	 * gson.toJson(topicService.viewTopicWithCourse(id));
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/loadStaffByCourse/{id}", method =
	 * RequestMethod.GET, produces = "application/json")
	 * 
	 * @ResponseBody public String loadStaffByBatch(@PathVariable("id") String id) {
	 * Gson gson = new Gson(); return
	 * gson.toJson(staffService.viewStaffWithCourse(id));
	 * 
	 * }
	 */

	@PostMapping("/insertClass")
	public String insertbatch(@RequestParam("batchId") String batch, @RequestParam("classDate") String date,
			@RequestParam("topicId") int topic, @RequestParam("staffId") int  staff, Model model) {

		dailyClassService.insertInto(batch, topic, staff, date);
		return "redirect:/DailyClassReg";

	}
}
