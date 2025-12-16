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


import com.mphasis.entities.User;
import com.mphasis.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService service;
	
	

	@GetMapping("/")
	public List<User> findAll(){
		logger.info("Request to findAll Employees");
		return service.findAll();
	}
	
	@GetMapping("userId/{userId}")
	public User findById(@PathVariable Long userId) {
		logger.info("Request to find Employee by Id");
		return service.findById(userId);
	}
	
	@PostMapping("/")
	public User save(@RequestBody User user) {
		logger.info("Request to save an Employee");
		return service.save(user);
	}
}
