package com.smi.trainingcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smi.trainingcenter.model.ComplaintBean;

@Repository
public interface ComplaintRepository extends JpaRepository<ComplaintBean, Integer> {
}
