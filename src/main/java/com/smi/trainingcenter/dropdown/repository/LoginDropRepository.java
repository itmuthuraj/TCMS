package com.smi.trainingcenter.dropdown.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.method.P;

import com.smi.trainingcenter.dropdown.model.LoginDropBean;

public interface LoginDropRepository extends CrudRepository<LoginDropBean, String>{
	@Query("select s.name from com.smi.trainingcenter.dropdown.model.StaffDropBean s join com.smi.trainingcenter.dropdown.model.StaffExperienceDropBean se on s.id = se.staff join com.smi.trainingcenter.dropdown.model.LoginDropBean l on l.id=se.login  where l.userId =:userId")
	public String getNameWithLogin(@Param("userId") String userId);
	
	@Query("select s.studentName from com.smi.trainingcenter.dropdown.model.StudentEnquiryDropBean s join com.smi.trainingcenter.dropdown.model.StudentEnrolmentDropBean se on s.id= se.student join com.smi.trainingcenter.dropdown.model.LoginDropBean l on l.id = se.login where l.userId = :userId")
	public String getStudentWithLogin(@Param("userId") String userId);
}
