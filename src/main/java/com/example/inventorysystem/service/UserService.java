package com.example.inventorysystem.service;

import com.example.inventorysystem.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUser();
    List<User> fetchUserList();
}
