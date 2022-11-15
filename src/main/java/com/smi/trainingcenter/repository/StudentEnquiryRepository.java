package com.smi.trainingcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.StudentEnquiry;

@Repository
public interface StudentEnquiryRepository extends JpaRepository<StudentEnquiry, Integer> {

}
