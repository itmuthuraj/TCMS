package com.smi.trainingcenter.dropdown.serviceImpl;

import java.util.List;

import com.smi.trainingcenter.dropdown.model.BatchDropEntity;
public interface BatchDropService {
	public List<BatchDropEntity> findByCourse(String id);

}