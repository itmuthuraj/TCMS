package com.smi.trainingcenter.dropdown.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.smi.trainingcenter.dropdown.model.BatchDropBean;
import com.smi.trainingcenter.dropdown.model.BatchDropEntity;

@Repository("batchDropRepository")
public interface BatchDropRepository extends CrudRepository<BatchDropBean, String> {
	@Query("select new com.smi.trainingcenter.dropdown.model.BatchDropEntity(id, name) from BatchDropBean where course.id = :id")
	public List<BatchDropEntity> findByCourse(@Param("id") String id);
}
