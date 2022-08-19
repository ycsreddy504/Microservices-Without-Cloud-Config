package com.coforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
