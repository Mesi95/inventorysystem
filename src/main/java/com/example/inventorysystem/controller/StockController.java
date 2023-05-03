package com.example.inventorysystem.controller;

import com.example.inventorysystem.model.Stock;
import com.example.inventorysystem.repository.*;
import com.example.inventorysystem.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/stock")
//@CrossOrigin
public class StockController {
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    ProductRepository productRepository;
//    @Autowired
//    StoreRepository storeRepository;
//    @Autowired
//    StockRepository stockRepository;
//    @Autowired
//    private StockService StockService;
//    @PostMapping("/add")
//    public String add(@RequestBody Stock stock){
//        StockService.saveStock(stock);
//        return "New Stock Added";
//    }
//    @GetMapping("/getAll")
//    public List<Stock> getAllStock(){
//        return StockService.getAllStock();
//    }
//    @GetMapping("/All")
//    public List<Stock> fetchStockList()
//    {
//        return StockService.fetchStockList();
//    }
//
//    @RequestMapping("/getStock")
//    public ResponseEntity<Object> getAllStocks(){
//        return StockService.getAllStocks();
//    }

//    @PostMapping("/addStore/{store_id}/to/{stock_id}")
//    public ResponseEntity<Object>
//    @PutMapping("/{stock_id}/user/{user_id}")
//    Stock addUserToStock(
//            @PathVariable int stock_id,
//            @PathVariable int user_id
//    ){
//        Stock stock = stockRepository.findById(stock_id).get();
//        User user = userRepository.findById(user_id).get();
//        stock.useStock(user);
//        return stockRepository.save(stock);
//    }
//    @PutMapping("/{stock_id}/store/{store_id}")
//    Stock addStoreToStock(
//            @PathVariable int stock_id,
//            @PathVariable int store_id
//    ){
//        Stock stock = stockRepository.findById(stock_id).get();
//        Store store = storeRepository.findById(store_id).get();
//        stock.storeStock(store);
//        return stockRepository.save(stock);
//    }
//    @PutMapping("/{stock_id}/product/{product_id}")
//    Stock addProductToStock(
//            @PathVariable int stock_id,
//            @PathVariable int product_id
//    ){
//        Stock stock = stockRepository.findById(stock_id).get();
//        Product product = productRepository.findById(product_id).get();
//        stock.productStock(product);
//        return stockRepository.save(stock);
//    }

}
