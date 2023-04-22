package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Category;
import com.example.inventorysystem.model.Role;

import java.util.List;

public interface RoleService {
    public Role saveRole(Role role);
    public List<Role> getAllRole();
    List<Role> fetchRoleList();
    Role updateRole(Role role, int role_id);
}
