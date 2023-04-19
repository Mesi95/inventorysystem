package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Store;
import com.example.inventorysystem.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StoreServiceImpl implements StoreService{
    @Autowired
    private StoreRepository StoreRepository;
    @Override
    public Store saveStore(Store store) {
        return StoreRepository.save(store);
    }
    @Override
    public List<Store> getAllStore() {
        return StoreRepository.findAll();
    }
    @Override
    public List<Store> fetchStoreList()
    {
        return (List<Store>)
                StoreRepository.findAll();
    }
}
