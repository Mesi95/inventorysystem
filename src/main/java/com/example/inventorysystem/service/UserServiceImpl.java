package com.example.inventorysystem.service;

import com.example.inventorysystem.model.User;
import com.example.inventorysystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository UserRepository;
    @Override
    public User saveUser(User user) {
        return UserRepository.save(user);
    }
    @Override
    public List<User> getAllUser() {
        return UserRepository.findAll();
    }
    @Override
    public List<User> fetchUserList()
    {
        return (List<User>)
                UserRepository.findAll();
    }
}
