package com.smi.trainingcenter.dropdown.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.dropdown.model.TopicDropEntity;
import com.smi.trainingcenter.dropdown.repository.TopicDropRepository;

@Service("topicDropService")
public class TopicDropServiceImpl implements TopicDropService{
	@Autowired
	private TopicDropRepository topicDropRepository;
	
	@Override
	public List<TopicDropEntity> findByCourse(String id) {
		// TODO Auto-generated method stub
		return topicDropRepository.findByCourse(id);
	}

	@Override
	public ArrayList<Object[]> viewTopicByCourseName() {
		// TODO Auto-generated method stub
		return topicDropRepository.getTopicWithCourse();
	}

}
