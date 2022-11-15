package com.smi.trainingcenter.dropdown.serviceImpl;
import com.smi.trainingcenter.dropdown.model.CourseDropBean;

public interface CourseDropService {
	public Iterable<CourseDropBean> findAll();

	public CourseDropBean find(String id);

}


