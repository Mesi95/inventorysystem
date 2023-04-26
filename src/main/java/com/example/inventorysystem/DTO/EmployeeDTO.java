package com.example.inventorysystem.DTO;

public class EmployeeDTO {
    private int employeeid;
    private String employeename;
    private String employeerole;
    private String email;
    private String password;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int employeeid, String employeename, String employeerole, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeerole=employeerole;
        this.email = email;
        this.password = password;
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
        return "EmployeeDTO{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", employeerole='" + employeerole + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
