package com.coforge.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entity.Department;
import com.coforge.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping(value = "/saveDepartment",produces = MediaType.APPLICATION_JSON_VALUE)
	public Department saveDepartment(@RequestBody Department department) {
		log.info("this is department controller save method");
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping(value="/get/{departmentid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Department getDepartmentById(@PathVariable Long departmentid) {
		Optional<Department> byId = departmentService.getById(departmentid);
		Department department=null;
		if(byId.isPresent()) {
			 department = byId.get();
		}
		return department;
	}
	
	

}
