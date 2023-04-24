package com.example.inventorysystem.controller;

import com.example.inventorysystem.DTO.EmployeeDTO;
import com.example.inventorysystem.DTO.LoginDTO;
import com.example.inventorysystem.LoginResponse.LoginMesage;
import com.example.inventorysystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public String add(@RequestBody EmployeeDTO employeeDtos){
        employeeService.addEmployee(employeeDtos);
        return "New Employee Added";
    }
    @PostMapping("/login")
    public ResponseEntity<?> LoginEmployeee(@RequestBody LoginDTO loginDTO){
        LoginMesage loginresponses=employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginresponses);
    }
}

