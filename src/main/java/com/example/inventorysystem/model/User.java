package com.example.inventorysystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int user_id;
    private String full_name;
    private String username;
    private String email;
    private String phone_no;
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id",referencedColumnName = "role_id")
    private Role role;

//        @JsonIgnore
//        @ManyToMany(mappedBy = "useStock")
//        private Set<Stock> userSet = new HashSet<>();
    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void assignRole(Role role) {
        this.role = role;
    }

//    public Set<Stock> getUserSet() {
//        return userSet;
//    }
}
//    public Set<Stock> getUseStock() {
//        return this.useStock;
//    }
//    @ManyToMany
//    @JoinTable(
//            name = "StockUser",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "stock_id")
//    )
//    Set<Stock> useStock = new HashSet<>();