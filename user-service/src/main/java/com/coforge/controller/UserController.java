package com.coforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entity.User;
import com.coforge.service.UserService;
import com.coforge.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		log.info("UserController saveUser");
		return userService.saveUser(user);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseTemplateVO getUserDetailAlongWithDepartment(@PathVariable Long id) {
		
		return userService.getUserAlongWithDepartment(id);
	}

}
