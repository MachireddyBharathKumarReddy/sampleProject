package com.sampleproject.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleproject.demo.dashboard.Application;

@Service
public class ApplicationService {
	

    private static List<Application> getAllApplications = new ArrayList<>() ;
    static {
        getAllApplications.add(new Application( 1,"java","java Release","admin",LocalDate.now().minusDays(2),"admin",LocalDate.now().minusDays(1)));
        getAllApplications.add(new Application( 2,"spring","spring Release","admin",LocalDate.now().minusDays(2),"admin",LocalDate.now().minusDays(1)));
        getAllApplications.add(new Application( 3,"angular","ang Release","admin",LocalDate.now().minusDays(2),"admin",LocalDate.now().minusDays(1)));
}
    public List<Application> findUsername(String username){
		return getAllApplications;
    	
    }
}