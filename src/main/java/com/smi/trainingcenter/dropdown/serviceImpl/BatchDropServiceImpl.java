package com.smi.trainingcenter.dropdown.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.dropdown.model.BatchDropEntity;
import com.smi.trainingcenter.dropdown.repository.BatchDropRepository;
@Service("batchDropService")
public class BatchDropServiceImpl implements BatchDropService {
	@Autowired
	private BatchDropRepository batchDropRepository;

	@Override
	public List<BatchDropEntity> findByCourse(String id) {
		return batchDropRepository.findByCourse(id);
	}

}