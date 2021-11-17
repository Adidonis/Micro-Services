package com.user.user_service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    //Dummy Data

    List<User> list = List.of(
        new User(101L, "Aditya Raj Saini", "9384949291"),
        new User(102L, "Pragati Tiwari", "976354931"),
        new User(103L, "Shekha Uttkarsh", "987954527")
    );


    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

    


    
}
