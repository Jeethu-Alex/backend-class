package com.example.backendclass.repository;

import com.example.backendclass.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user = new User("christy s", "usa", 16);
        return user;
    }
}
