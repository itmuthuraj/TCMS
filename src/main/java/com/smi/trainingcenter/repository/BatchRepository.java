package com.smi.trainingcenter.repository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch, String> {

	@Transactional
	@Procedure(procedureName = "batchs", outputParameterName = "bid")
	String getBatchIdAuto(@Param("bdate") String bdate, @Param("cid") String cid);

	@Query("select r.courseId from Batch r where r.batchId =:batchId")
	String getCourseIdWithBatch(@Param("batchId") String batchId);

	@Query("select max(batchId) from Batch where courseId in (select courseId from Course where courseName =:courseName)")
	String getBatchId(@Param("courseName") String courseName);
	
	/*
	 * @Query("Select new com.smi.trainingcenter.model.dropdown.BatchEntity(id, name) from Batch  where id=:id"
	 * ) public List<BatchEntity> findBatchOfCourse(@Param("id") String id);
	 */
}
