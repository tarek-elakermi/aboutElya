package com.esprit.tn.controllers;


import com.esprit.tn.models.Product;
import com.esprit.tn.models.User;
import com.esprit.tn.services.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserServiceImplementation userServiceImplementation;

    @PostMapping("/v1/")
    public User saveUser(User u){
        return userServiceImplementation.save(u);
    }

    @GetMapping("/getUsers")
    public List<User> getAllList(){
        return userServiceImplementation.getUsers();
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userServiceImplementation.deleteUser(userId);
    }

    @GetMapping("/getPr/{name}")
    public Product getPr(@PathVariable("name") String name){
        return userServiceImplementation.getProductByName(name);
    }














}
