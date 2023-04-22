package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Store;

import java.util.List;
public interface StoreService {
    public Store saveStore(Store store);
    public List<Store> getAllStore();
    List<Store> fetchStoreList();
    Store updateStore(Store store, int store_id);
}
