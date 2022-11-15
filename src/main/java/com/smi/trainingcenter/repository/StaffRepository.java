package com.smi.trainingcenter.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	/*
	 * @Query("select new com.smi.trainingcenter.model.StaffEntity(r.staffId, r.staffName) from Staff r where r.courseId=:courseId"
	 * ) List<Staff> findStaffOfCourse(@Param("courseId") String courseId);
	 */
}
