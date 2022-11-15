package com.smi.trainingcenter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.*;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<TotalStudentBean, Integer> {

	@Query(value = "select * from studentenquiry e where e.studentName like %:keyword%", nativeQuery = true)
	List<TotalStudentBean> findByKeyword(@Param("keyword") String keyword);
}
