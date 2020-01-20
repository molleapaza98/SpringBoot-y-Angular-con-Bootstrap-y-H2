package com.erickmp98.demoapi.controller;

import com.erickmp98.demoapi.model.User;
import com.erickmp98.demoapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<User> getUser(){
        return (List<User>) repository.findAll();
    }

    @PostMapping("/users")
    void addUser(User user){
        repository.save(user);
    }
}
