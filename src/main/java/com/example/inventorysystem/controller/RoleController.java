package com.example.inventorysystem.controller;

import com.example.inventorysystem.model.Category;
import com.example.inventorysystem.model.Role;
import com.example.inventorysystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@CrossOrigin
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping("/add")
    public String add(@RequestBody Role role){
        roleService.saveRole(role);
        return "New Role Added";
    }
    @GetMapping("/getAll")
    public List<Role> getAllRole(){
        return roleService.getAllRole();
    }
    @GetMapping("/All")
    public List<Role> fetchRoleList()
    {
        return roleService.fetchRoleList();
    }
    @PutMapping("/{role_id}")
    public Role
    updateUserRole(@RequestBody Role role,
                          @PathVariable("role_id") int role_id)
    {
        return roleService.updateRole(
                role, role_id);
    }
}
