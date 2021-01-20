package com.springboot.crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
