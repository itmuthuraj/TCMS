package com.smi.trainingcenter.dropdown.repository;

import java.util.ArrayList;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smi.trainingcenter.dropdown.model.BatchDropBean;
import com.smi.trainingcenter.dropdown.model.StaffDropBean;
import com.smi.trainingcenter.dropdown.model.StudentEnquiryDropBean;

public interface StudentDropRepository extends CrudRepository<StudentEnquiryDropBean, Integer>{

		@Query("select s.studentName,s.studentAddress,s.mailId,s.studentMobile,s.dateOfBirth,s.gender,s.studentQualification,s.department,s.yearOfPassing,s.institute,b.name,c.name,se.dateOfJoining,se.feesPaymentStatus from com.smi.trainingcenter.dropdown.model.CourseDropBean c join com.smi.trainingcenter.dropdown.model.BatchDropBean b on c.id=b.course join com.smi.trainingcenter.dropdown.model.StudentEnquiryDropBean s on b.id=s.batch join com.smi.trainingcenter.dropdown.model.StudentEnrolmentDropBean se on s.id=se.student join com.smi.trainingcenter.dropdown.model.LoginDropBean l on l.id=se.login where l.userId=:userId")
		public ArrayList<Object[]> viewStudentProfile(@Param("userId") String userId);
}