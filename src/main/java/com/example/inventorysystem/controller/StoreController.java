package com.example.inventorysystem.controller;

import com.example.inventorysystem.model.Store;
import com.example.inventorysystem.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/store")
@CrossOrigin
public class StoreController {
    StoreService storeService;
    @PostMapping("/add")
    public String add(@RequestBody Store store){


        storeService.saveStore(store);
        return "New Store Added";
    }
    @GetMapping("/getAll")
    public List<Store> getAllStore(){
        return storeService.getAllStore();
    }
    @GetMapping("/All")
    public List<Store> fetchStoreListList()
    {
        return storeService.fetchStoreList();
    }
    @PutMapping("/{store_id}")
    public Store
    updateStockStore(@RequestBody Store store,
                          @PathVariable("store_id") int store_id)
    {
        return storeService.updateStore(
                store, store_id);
    }
}
