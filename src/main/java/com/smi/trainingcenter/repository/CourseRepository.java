package com.smi.trainingcenter.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

	@Transactional
	@Procedure(procedureName = "courseid", outputParameterName = "cid")
	String getCourseIdAuto(@Param("cname") String cname);

	@Transactional
	@Query("select r.courseName from Course r where r.courseId= :courseId")
	String getCourseIdWithName(@Param("courseId") String courseId);

	@Modifying
	@Query("select r.courseName from Course r")
	String getCourseNames();
}
