package com.smi.trainingcenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.smi.trainingcenter.details.MyUserDetail;
import com.smi.trainingcenter.repository.LoginRepository;
import com.smi.trainingcenter.repository.StudentRepository;
import com.smi.trainingcenter.model.*;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	LoginRepository loginRepository;

	@Autowired
	StudentRepository studentrepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Login> login = loginRepository.findByUserName(username);

		login.orElseThrow(() -> new UsernameNotFoundException("Not Found :" + username));
		return login.map(MyUserDetail::new).get();
	}

	public Page<TotalStudentBean> getAllEmployee(String sortField, String sortDir) {
		Sort sort = Sort.by("name");
		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
		Pageable pageable = PageRequest.of(0, 1000, sort);
		return studentrepository.findAll(pageable);
	}

	public void insertEmployee(TotalStudentBean signup) {
		studentrepository.save(signup);
	}

	public Page<TotalStudentBean> getAllEmployee() {
		Pageable pageable = PageRequest.of(0, 1000);
		System.out.println(studentrepository.findAll());
		return studentrepository.findAll(pageable);
	}

	public List<TotalStudentBean> findByKeyword(String keyword) {
		return studentrepository.findByKeyword(keyword);
	}

	public Page<TotalStudentBean> findPaginated(String sortField, String sortDir) {
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();

		Pageable pageable = PageRequest.of(0, 1000, sort);
		return this.studentrepository.findAll(pageable);
	}
}
