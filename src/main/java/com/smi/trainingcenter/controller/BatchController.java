package com.smi.trainingcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smi.trainingcenter.model.Course;
import com.smi.trainingcenter.service.BatchService;
import com.smi.trainingcenter.service.CourseService;

@Controller
public class BatchController {
	@Autowired
	BatchService batchService;

	@Autowired
	CourseService courseService;

	@PostMapping("/insertbatch")
	public String insertbatch(@RequestParam("courseId") String course, @RequestParam("batchStartDate") String date,
			Model model) {
		// batch.setCourseId(course);
		// batch.setBatchStartDate(date);
		batchService.insertInto(course, date);
		return "redirect:/AdminAddBatch";

	}

}
