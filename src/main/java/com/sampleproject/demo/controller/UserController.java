package com.sampleproject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sampleproject.demo.model.User;
import com.sampleproject.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/signup")
	public String signup(@ModelAttribute("user") User user, Model model) {
		
		  if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) { 
			  return "signup"; 
			  }
		boolean success = userService.registerUser(user);
		if (success) {
			model.addAttribute("successmessage", "User registered successfully!");
		} else {
			model.addAttribute("failuremessage", "Username already taken.");
		}
		return "signup";
	}
}
