package com.smi.trainingcenter.dropdown.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smi.trainingcenter.dropdown.model.StaffDropBean;
import com.smi.trainingcenter.dropdown.model.StaffDropEntity;

public interface StaffDropRepository extends CrudRepository<StaffDropBean, Integer>{
	@Query("select new com.smi.trainingcenter.dropdown.model.StaffDropEntity(id, name) from StaffDropBean where course.id = :id")
	public List<StaffDropEntity> findByCourse(@Param("id") String id);
	
	@Query("select s.name, s.mobile, s.mailId, s.dateOfBirth, s.gender, c.name, se.yearOfExperience, se.previousCompanyWorked, se.staffQualification from com.smi.trainingcenter.dropdown.model.CourseDropBean c join com.smi.trainingcenter.dropdown.model.StaffDropBean s on c.id=s.course join com.smi.trainingcenter.dropdown.model.StaffExperienceDropBean se on s.id=se.staff join com.smi.trainingcenter.dropdown.model.LoginDropBean l on l.id=se.login where l.userId=:userId")
	public ArrayList<Object[]> viewStaffProfile(@Param("userId") String userId);
}