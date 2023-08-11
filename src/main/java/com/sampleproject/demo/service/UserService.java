package com.sampleproject.demo.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sampleproject.demo.model.User;
import com.sampleproject.demo.repository.UserRepository;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public boolean registerUser(User user) {
      
        if (StringUtils.isEmpty(user.getUsername())) {
            return false; 
        }
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return false;
        }
        userRepository.save(user);
        return true;
    }

 
    
}




	





