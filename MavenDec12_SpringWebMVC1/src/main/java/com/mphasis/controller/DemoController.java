//package com.mphasis.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.mphasis.model.User;
//import com.mphasis.service.UserService;
//
//@Controller
//public class DemoController {
//	
//	@Autowired
//	UserService serv;
//	
//	@RequestMapping("/login")
//	public ModelAndView login() {
//		return new ModelAndView("login");
//	}
//	
//	@RequestMapping("/home/{role}")
//	//
//	//@PathVariable String uname,@PathVariable String pwd /{uname}/{pwd}
//	public ModelAndView home(@PathVariable String role,@RequestParam("uname") String uname,@RequestParam("pwd") String pwd) {
//		
//		boolean res=serv.doAuthenticate(role,uname,pwd);
//		if(res) {
//			ModelAndView mv= new ModelAndView("home");
//			mv.addObject("username",uname);
////			mv.addObject("pwd",pwd);
//			return mv;
//		}
//		return new ModelAndView("error");
//	}
//	
////	@RequestMapping("/home/userInfo/{uname}")
////	public ModelAndView userDetails(@PathVariable String uname) {
////		User user=serv.userDetails(uname);
////		ModelAndView mv=new ModelAndView("info");
////		mv.addObject("user",user);
////		return mv;
////	}
//	
//	@RequestMapping("/signup")
//	public ModelAndView add() {
//		return new ModelAndView("add");
//	}
//	
//	@RequestMapping(value="/addUser",method=RequestMethod.POST)
//	public ModelAndView addUser(@ModelAttribute("user") User user) {
//		ModelAndView mv=new ModelAndView("result");
//		User u=serv.addUser(user);
//		mv.addObject("username",u.getUname());
//		return mv;
//	}
//	
//}
