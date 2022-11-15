package com.smi.trainingcenter.repository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer> {
	/*
	 * @Query("select new com.smi.trainingcenter.model.TopicEntity(r.topicId, r.topicName) from Topic r where r.courseId= :courseId"
	 * ) List<Topic> findTopicOfCourse(@Param("courseId") String courseId);
	 */
	/*
	 * @Query("select q.courseName,p.topicName,p.duration,p.topicDescription, p.topicId from Topic p join Course q on p.courseId=q.courseId "
	 * ) public ArrayList getTopicWithCourse();
	 */
}
