package com.mphasis.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mphasis.entities.Employee;
import com.mphasis.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		//logger.info("Fetching all Employees");
		return repository.findAll();
	}
	
	public Employee findById(Long id) {
		//logger.info("Retrieving Employee by Id");
		return repository.findById(id).get();
	}
	
	public Employee save(Employee emp) {
		//logger.info("Saving an Employee");
		return repository.save(emp);
	}
	
}
