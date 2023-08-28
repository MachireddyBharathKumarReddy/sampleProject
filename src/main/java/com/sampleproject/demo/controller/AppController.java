package com.sampleproject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sampleproject.demo.model.Application;
import com.sampleproject.demo.service.AppService;

import jakarta.validation.Valid;

@Controller
public class AppController {

    @Autowired
    private AppService applicationService;

	@RequestMapping("/applications")
	public String showApplications(ModelMap model) {
		List<Application> getAllApplications = applicationService.getAllApplications();
		model.addAttribute("getAllApplications", getAllApplications);
		return "Applicationlist";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String shownewApplicationPage() {

		return "Application";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String createApplication(@ModelAttribute Application application) {
		applicationService.createApplication(application);
		return "redirect:applications";
	}

	@RequestMapping("/delete")
	public String deleteApplication(@RequestParam int id) {
		applicationService.deleteApplicationById(id);
		return "redirect:applications";
	}

	@RequestMapping(value = "update/{applicationId}", method = RequestMethod.GET)
	public String showUpdateApplicationPage(@PathVariable int applicationId, ModelMap model) {
		Application application = applicationService.getApplicationById(applicationId);
		model.addAttribute("application", application);
		return "Application"; // Return the view for updating an application
	}

	@RequestMapping(value = "update/{applicationId}", method = RequestMethod.POST)
	public String updateApplication(@PathVariable int applicationId,@Valid Application application) {
		application.setApplicationId(applicationId);
		applicationService.updateApplication(application);
		return "redirect:/applications"; // Redirect to the list of applications
	}
}
