package com.sampleproject.demo.service;

import java.time.LocalDate;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.sampleproject.demo.model.Application;

@Service
public class ApplicationService {
	

    private static List<Application> getAllApplications = new ArrayList<>() ;
    private static int idcount =0;
    static {
        getAllApplications.add(new Application( ++idcount,"java","java Release","admin",LocalDate.now().minusDays(2),"admin",LocalDate.now().minusDays(1)));
        getAllApplications.add(new Application( ++idcount,"spring","spring Release","admin",LocalDate.now().minusDays(2),"admin",LocalDate.now().minusDays(1)));
        getAllApplications.add(new Application( ++idcount,"angular","ang Release","admin",LocalDate.now().minusDays(2),"admin",LocalDate.now().minusDays(1)));
}
    public List<Application> findUsername(String username){
		return getAllApplications;
    	
    }
    public void addApplication( String name, String description,String createBy,  LocalDate createDate,String lastUpdate, LocalDate lastUpdateDate) {
    Application application = new Application(++idcount,name,description,createBy,createDate,lastUpdate,lastUpdateDate);
    getAllApplications.add(application);
    }
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Application>predicate=Application->Application.getApplicationId()==id;
		getAllApplications.removeIf(predicate);
		
	}
	
	public Application findById(int id) 
	  { 
	Predicate<? super Application>predicate=Application->Application.getApplicationId()==id;
	  Application application = getAllApplications.stream().filter(predicate).findFirst().get(); 
	  return application; 
	  }
	  
	public void updateApplication(@Valid Application application) {
		// TODO Auto-generated method stub
		deleteById(application.getApplicationId());
		getAllApplications.add(application);
		
	}
	
	 	
	 
}