package com.smi.trainingcenter.dropdown.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.smi.trainingcenter.dropdown.model.TopicDropEntity;

public interface TopicDropService {
	public List<TopicDropEntity> findByCourse(String id);
	public ArrayList<Object[]> viewTopicByCourseName();
}
