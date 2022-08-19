package com.coforge.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceSubCategoryId")
    //@SequenceGenerator(name = "SequenceSubCategoryId", sequenceName = "SUB_CATEGORY_SEQ")
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	

}
