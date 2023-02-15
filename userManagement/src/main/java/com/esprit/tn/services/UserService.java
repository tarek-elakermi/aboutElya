package com.esprit.tn.services;

import com.esprit.tn.models.Product;
import com.esprit.tn.models.User;

import java.util.List;

public interface UserService {
    User save(User u);
    List<User> getUsers();
    void deleteUser(Long userId);

    Product getProductByName(String name);
}
