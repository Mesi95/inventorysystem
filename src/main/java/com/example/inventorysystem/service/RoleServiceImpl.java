package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Category;
import com.example.inventorysystem.model.Role;
import com.example.inventorysystem.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository RoleRepository;
    @Override
    public Role saveRole(Role role) {
        return RoleRepository.save(role);
    }
    @Override
    public List<Role> getAllRole() {
        return RoleRepository.findAll();
    }
    @Override
    public List<Role> fetchRoleList()
    {
        return (List<Role>)
                RoleRepository.findAll();
    }
    @Override
    public Role
    updateRole(Role role, int role_id)
    {
        Role userR
                = RoleRepository.findById(role_id)
                .get();
        if (Objects.nonNull(role.getRole_name())
                && !"".equalsIgnoreCase(
                role.getRole_name())) {
            userR.setRole_name(
                    role.getRole_name());
        }

        if (Objects.nonNull(role.getDescription())
                && !"".equalsIgnoreCase(
                role.getDescription())) {
            userR.setDescription(
                    role.getDescription());
        }

        return RoleRepository.save(userR);
    }
}
