package com.smi.trainingcenter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smi.trainingcenter.model.Login;

public interface LoginRepository extends JpaRepository<Login, String> {
	Optional<Login> findByUserName(String userId);
}
