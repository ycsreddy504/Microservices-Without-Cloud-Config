package com.coforge.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coforge.entity.User;
import com.coforge.repository.UserRepository;
import com.coforge.vo.Department;
import com.coforge.vo.ResponseTemplateVO;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {

		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserAlongWithDepartment(Long id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Optional<User> userOptional = userRepository.findById(id);
		User user = new User();
		Department department = new Department();
		if (userOptional.isPresent()) {
			user = userOptional.get();
			// how do we get the other service details ?
			department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/get/" + user.getDepartmentId(),
					Department.class);
		}
		

		vo.setDepartment(department);
		vo.setUser(user);
		return vo;

	}

}
