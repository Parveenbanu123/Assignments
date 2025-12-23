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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
@Tag(name="User Api",description = "CRUD Operations on User")
public class UserController {
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService service;
	
	

	@GetMapping("/")
	@Operation(summary="find all users")
	@ApiResponse(responseCode = "200",description = "Retrieves all Users info")
	public List<User> findAll(){
		logger.info("Request to findAll Employees");
		return service.findAll();
	}
	
	@GetMapping("userId/{userId}")
	@Operation(summary="find  user by id")
	@ApiResponses({@ApiResponse( responseCode = "200",description = "User exists with the given id"),
			@ApiResponse( responseCode = "404",description = "User not Found")})
	public User findById(@PathVariable Long userId) {
		logger.info("Request to find Employee by Id");
		return service.findById(userId);
	}
	
	@PostMapping("/")
	@Operation(summary="Create User ")
	@ApiResponse(responseCode = "200",description = "User created succesfully")
	public User save(@Valid @RequestBody User user) {
		logger.info("Request to save an Employee");
		return service.save(user);
	}
}
