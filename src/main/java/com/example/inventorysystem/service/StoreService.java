package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Store;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

public interface StoreService {

    public Store saveStore(Store store);
    public List<Store> getAllStore();
    List<Store> fetchStoreList();


}
