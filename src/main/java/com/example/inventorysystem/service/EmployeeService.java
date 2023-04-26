package com.example.inventorysystem.service;

import com.example.inventorysystem.DTO.EmployeeDTO;
import com.example.inventorysystem.DTO.LoginDTO;
import com.example.inventorysystem.model.Employee;
import com.example.inventorysystem.LoginResponse.LoginMesage;

import java.util.List;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);

}
