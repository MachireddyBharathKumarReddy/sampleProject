package com.sampleproject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sampleproject.demo.dashboard.Application;

import com.sampleproject.demo.service.ApplicationService;

import java.util.List;

@Controller
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	

    @RequestMapping("/applications")
    public String showApplications(ModelMap model) {
        List<Application> getAllApplications=applicationService.findUsername("admin");
        model.addAttribute("getAllApplications",getAllApplications);
        return "Applicationlist";
    }
    @RequestMapping(value="add",method=RequestMethod.GET)
    public String shownewApplicationPage() {
        
        return "Application";
    }
    @RequestMapping(value="add",method=RequestMethod.POST)
    public String addnewApplicationPage() {
        
        return "redirect:applications";
    }
}
