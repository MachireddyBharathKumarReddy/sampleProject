package com.sampleproject.demo.controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//Annotation
@Controller

//Class
public class LoginController {
	
	private AuthenticationService authenticationService;
	

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginpage() {
	    
	    return "login";
	}
	    @RequestMapping(value="login",method=RequestMethod.POST)
		public String dashboardpage(@RequestParam String username,@RequestParam String password,ModelMap model) {
	    	if(username.length() > 12) {
	    		model.put("errorMessage", "Maximum 12 characters");
	    		return "login";
	    	}
	    	else if(authenticationService.authenticate(username, password)) {
				 return "redirect:/applications";
			}
		
			model.addAttribute("invalidMessage", "Invalid credentials!");

			return "login";
}
}






