package com.mphasis.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.entities.Employee;
import com.mphasis.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/")
	public List<Employee> findAll(){
		logger.info("Request to findAll Employees");
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable Long id) {
		logger.info("Request to find Employee by Id");
		return service.findById(id);
	}
	
	@PostMapping("/")
	public Employee save(@RequestBody Employee emp) {
		logger.info("Request to save an Employee");
		return service.save(emp);
	}
}
