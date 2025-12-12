package com.mphasis.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mphasis.model.User;
import com.mphasis.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user/{id}")
	public User userDetails(@PathVariable Long id){
		return service.userDetails(id);
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/home/{role}")
	public ModelAndView home(@PathVariable String role,@RequestParam("uname") String uname,@RequestParam("pwd") String pwd) {
		
		boolean res=service.doAuthenticate(role,uname,pwd);
		ModelAndView mv=new ModelAndView();
		if(res) {
			if(role.equals("admin")) {
				mv.setViewName("list");
				List<User> userList=service.getUserList();
				mv.addObject("userList",userList);
			}
			else
				if(role.equals("user")) {
					mv.setViewName("list");
					mv.addObject("username",uname);
				}
				else {
					mv.setViewName("home");
					mv.addObject("username",uname);
				}
		}
		return mv;
	}
	
	@RequestMapping("/signup")
	public ModelAndView add() {
		return new ModelAndView("add");
	}
	
	@RequestMapping("/home/userList")
	public ModelAndView getUserList(){
		List<User> userList=service.getUserList();
		ModelAndView mv=new ModelAndView("list");
		mv.addObject("userList",userList);
		return mv;
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(@ModelAttribute("user") User user) {
		ModelAndView mv=new ModelAndView("result");
		User u=service.addUser(user);
		mv.addObject("username",u.getUname());
		return mv;
	}
	
//	@RequestMapping("/home/userInfo/{uid}")
//public ModelAndView userDetails1(@PathVariable Long uid) {
//	User user=service.userDetails(uid);
//	ModelAndView mv=new ModelAndView("info");
//	mv.addObject("user",user);
//	return mv;
//}
	
}
