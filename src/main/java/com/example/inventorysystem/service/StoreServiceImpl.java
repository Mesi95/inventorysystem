package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Store;
import com.example.inventorysystem.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public abstract class StoreServiceImpl implements StoreService{
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
    @Override
    public Store
    updateStore(Store store, int store_id)
    {
        Store stockS
                = StoreRepository.findById(store_id)
                .get();
        if (Objects.nonNull(store.getStore_name())
                && !"".equalsIgnoreCase(
                store.getStore_name())) {
            stockS.setStore_name(
                    store.getStore_name());
        }

        if (Objects.nonNull(
                store.getBranch())
                && !"".equalsIgnoreCase(
                store.getBranch())) {
            stockS.setBranch(
                    store.getBranch());
        }

        if (Objects.nonNull(store.getDescription())
                && !"".equalsIgnoreCase(
                store.getDescription())) {
            stockS.setDescription(
                    store.getDescription());
        }

        return StoreRepository.save(stockS);
    }
}
