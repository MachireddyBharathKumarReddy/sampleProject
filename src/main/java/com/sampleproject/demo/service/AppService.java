package com.sampleproject.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleproject.demo.model.Application;
import com.sampleproject.demo.repository.ApplicationRepository;

@Service
public class AppService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }


    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application getApplicationById(int applicationId) {
        return applicationRepository.findById(applicationId).orElse(null);
    }
    

        public Application updateApplication(Application updatedApplication) {
            if (updatedApplication.getApplicationId() == 0) {
                // Application with ID 0 indicates it's a new application, not an update
                return null;
            }
            Application existingApplication = applicationRepository.findById(updatedApplication.getApplicationId()).orElse(null);
            if (existingApplication == null) {
                return null; // Application with the specified ID not found
            }

            // Perform updates
            existingApplication.setName(updatedApplication.getName());
            existingApplication.setDescription(updatedApplication.getDescription());
            existingApplication.setCreateBy(updatedApplication.getCreateBy());
            existingApplication.setCreateDate(updatedApplication.getCreateDate());
            existingApplication.setLastUpdate(updatedApplication.getLastUpdate());
            existingApplication.setLastUpdateDate(updatedApplication.getLastUpdateDate());
            return applicationRepository.save(existingApplication);
        }

    public boolean deleteApplicationById(int applicationId) {
        if (!applicationRepository.existsById(applicationId)) {
            return false; // Application with the specified ID not found
        }
        applicationRepository.deleteById(applicationId);
        return true;
    }
}


