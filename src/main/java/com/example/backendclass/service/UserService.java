package com.example.backendclass.service;

import com.example.backendclass.model.User;
import com.example.backendclass.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }

}
