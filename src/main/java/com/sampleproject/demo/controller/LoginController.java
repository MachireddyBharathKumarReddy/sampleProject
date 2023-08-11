package com.sampleproject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sampleproject.demo.model.User;
import com.sampleproject.demo.repository.UserRepository;



//Annotation
@Controller

//Class
public class LoginController {
	
	 @Autowired
	    private UserRepository userRepository;
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginpage() {
	    
	    return "login";
	}
	    @RequestMapping(value="login",method=RequestMethod.POST)
		public String dashboardpage(@RequestParam String username,@RequestParam String password,ModelMap model) {
	    	  User user = userRepository.findByUsername(username);
	    	if(username.length() > 12) {
	    		model.put("errorMessage", "Maximum 12 characters");
	    		return "login";
	    	}
	    	else if(user != null && user.getPassword().equals(password)) {
				 return "redirect:/applications";
			}
		
			model.addAttribute("invalidMessage", "Invalid credentials!");

			return "login";
}
}






