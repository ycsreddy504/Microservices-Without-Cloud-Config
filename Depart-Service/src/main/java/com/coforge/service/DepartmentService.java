package com.coforge.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entity.Department;
import com.coforge.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Optional<Department> getById(Long departmentid) {
		return departmentRepository.findById(departmentid);
	}

}
