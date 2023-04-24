package com.example.inventorysystem.service;

import com.example.inventorysystem.DTO.EmployeeDTO;
import com.example.inventorysystem.DTO.LoginDTO;
import com.example.inventorysystem.LoginResponse.LoginMesage;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);

}
