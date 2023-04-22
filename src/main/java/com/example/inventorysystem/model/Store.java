package com.example.inventorysystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int store_id;
    private String store_name;
    private String branch;
    private String description;
//    @JsonIgnore
//    @ManyToMany(mappedBy = "storeStock")
//    private Set<Stock> storeSet;
//= new HashSet<>()

    public Store(int store_id,String store_name,String branch, String description) {
        this.store_id=store_id;
        this.store_name=store_name;
        this.branch=branch;
        this.description=description;
    }
    public Store(String store_name,String branch){
        super();
        this.store_name=store_name;
        this.branch=branch;
    }

    public Store() {
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Set<Stock> getStoreSet() {
//        return storeSet;
//    }
}