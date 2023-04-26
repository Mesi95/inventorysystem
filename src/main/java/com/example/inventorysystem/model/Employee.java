package com.example.inventorysystem.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="employeeid", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;

    @Column(name="employeename", length = 100)
    private String employeename;

    @Column(name="employeerole", length = 100)
    private String employeerole;

    @Column(name="email", length = 255)
    private String email;

    @Column(name="password", length = 255)
    private String password;


    public Employee(int employeeid, String employeename,String employeerole, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeerole=employeerole;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeerole() {
        return employeerole;
    }

    public void setEmployeerole(String employeerole) {
        this.employeerole = employeerole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", employeerole='" + employeerole + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
