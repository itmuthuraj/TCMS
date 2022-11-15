package com.smi.trainingcenter.dropdown.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.dropdown.repository.LoginDropRepository;

@Service("loginDropService")
public class LoginDropServiceImpl implements LoginDropService{
	@Autowired LoginDropRepository loginDropRepository;

	@Override
	public String getNameWithLogin(String userId) {
		// TODO Auto-generated method stub
		return loginDropRepository.getNameWithLogin(userId);
	}

	@Override
	public String getStudentWithLogin(String userId) {
		// TODO Auto-generated method stub
		return loginDropRepository.getStudentWithLogin(userId);
	}

}
