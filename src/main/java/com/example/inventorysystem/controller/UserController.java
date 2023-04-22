package com.example.inventorysystem.controller;

import com.example.inventorysystem.model.Category;
import com.example.inventorysystem.model.Product;
import com.example.inventorysystem.model.Role;
import com.example.inventorysystem.model.User;
import com.example.inventorysystem.repository.CategoryRepository;
import com.example.inventorysystem.repository.ProductRepository;
import com.example.inventorysystem.repository.RoleRepository;
import com.example.inventorysystem.repository.UserRepository;
import com.example.inventorysystem.service.ProductService;
import com.example.inventorysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New User Added";
    }
    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/All")
    public List<User> fetchUserList()
    {
        return userService.fetchUserList();
    }
    @PutMapping("/{user_id}/role/{role_id}")
    User RegisterRoleToUser(
            @PathVariable int user_id,
            @PathVariable int role_id
    ){
        User user = userRepository.findById(user_id).get();
        Role role = roleRepository.findById(role_id).get();
        user.assignRole(role);
        return userRepository.save(user);
    }
}
