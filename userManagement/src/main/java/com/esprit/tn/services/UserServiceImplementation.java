package com.esprit.tn.services;


import com.esprit.tn.models.Product;
import com.esprit.tn.models.User;
import com.esprit.tn.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{


    @Autowired
    public UserRepo userRepo;

    @Autowired
    public RestTemplate restTemplate;


    @Override
    public User save(User u) {
        User user = userRepo.save(u);
        return user;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userRepo.findAll();
        return users;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public Product getProductByName(String name) {
        Product product = restTemplate.getForObject("http://localhost:8081/getProduct/cola",Product.class);
        return product;
    }
}
