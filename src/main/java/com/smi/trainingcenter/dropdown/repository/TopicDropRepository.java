package com.smi.trainingcenter.dropdown.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smi.trainingcenter.dropdown.model.TopicDropEntity;
import com.smi.trainingcenter.dropdown.model.TopicDropBean;

public interface TopicDropRepository extends CrudRepository<TopicDropBean, Integer>{
	@Query("select new com.smi.trainingcenter.dropdown.model.TopicDropEntity(id, name) from TopicDropBean where course.id = :id")
	public List<TopicDropEntity> findByCourse(@Param("id") String id);
	
	 @Query("select c.name, t.name, t.duration, t.topicDescription from com.smi.trainingcenter.dropdown.model.TopicDropBean t join com.smi.trainingcenter.dropdown.model.CourseDropBean c on c.id=t.course" )
	 public ArrayList<Object[]> getTopicWithCourse();
}
