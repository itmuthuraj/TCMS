package com.smi.trainingcenter.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.DailyClass;

@Repository
public interface DailyClassRepository extends CrudRepository<DailyClass, Integer> {

	/*
	 * @Query("select p.topicName,p.duration, p.topicDescription, q.courseName from DailyClass p join Course q on p.courseId=q.courseId"
	 * ) public ArrayList getDailyClassWithCourse();
	 */
}
