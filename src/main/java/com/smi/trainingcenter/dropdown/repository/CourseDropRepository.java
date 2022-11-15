package com.smi.trainingcenter.dropdown.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.dropdown.model.CourseDropBean;


@Repository("courseDropRepository")
public interface CourseDropRepository extends CrudRepository<CourseDropBean, String> {

}


