package com.smi.trainingcenter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.model.Staff;
import com.smi.trainingcenter.model.Topic;
import com.smi.trainingcenter.repository.CourseRepository;
import com.smi.trainingcenter.repository.TopicRepository;

@Service
public class TopicService extends Topic {
	@Autowired
	TopicRepository topicRepository;
	@Autowired
	CourseRepository courseRepository;

	public void insertValue(String courseId, String duration, String topicDescription, String topicName) {
		Topic topic = new Topic();
		topic.setCourseId(courseId);
		topic.setDuration(duration);
		topic.setTopicDescription(topicDescription);
		topic.setTopicName(topicName);
		this.topicRepository.save(topic);
	}

	public List<Topic> viewTopic() {
		List<Topic> list = (List<Topic>) topicRepository.findAll();
		return list;
	}
	/*
	 * public List<Topic> viewTopicWithCourse(String courseId) { List<Topic> list =
	 * (List<Topic>) topicRepository.findTopicOfCourse(courseId); return list; }
	 */
	/*
	 * public List viewTopicWith() { ArrayList<String> view =
	 * topicRepository.getTopicWithCourse(); return null;
	 * 
	 * }
	 */
	
	

}
