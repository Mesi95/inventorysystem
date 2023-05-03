package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Stock;
import com.example.inventorysystem.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
//
//@Service
public class StockServiceImpl implements StockService{
//    @Autowired
//    private StockRepository StockRepository;
//    StoreService storeService;
//    @Override
//    public Stock saveStock(Stock stock) {
//        return StockRepository.save(stock);
//    }
//    @Override
//    public List<Stock> getAllStock() {
//        return StockRepository.findAll();
//    }
//    @Override
//    public List<Stock> fetchStockList()
//    {
//        return (List<Stock>)
//                StockRepository.findAll();
//    }
//    public ResponseEntity<Object> getAllStocks(){
//        List<Stock> dbStock = StockRepository.findAll();
//        if (dbStock.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(dbStock,HttpStatus.OK);
//    }
//    @Override
//    public Stock
//    updateStock(Stock stock, int stock_id)
//    {
//        Stock userStock
//                = StockRepository.findById(stock_id)
//                .get();
//        if (Objects.nonNull(stock.getUseStock())
//                && !"".equalsIgnoreCase(
//                stock.getUseStock().toString())) {
//            userStock.setUseStock(
//                    stock.getUseStock());
//        }
//
//        if (Objects.nonNull(
//                stock.getStoreStock())
//                && !"".equalsIgnoreCase(
//                stock.getStoreStock().toString())) {
//            userStock.setStoreStock(
//                    stock.getStoreStock());
//        }
//
//        if (Objects.nonNull(stock.getProductStock())
//                && !"".equalsIgnoreCase(
//                stock.getProductStock().toString())) {
//            userStock.setProductStock(
//                    stock.getProductStock());
//        }
//        if (Objects.nonNull(stock.getQty())
//                && !"".equalsIgnoreCase(
//                String.valueOf(stock.getQty()))) {
//            userStock.setQty(
//                    stock.getQty());
//        }
//        if (Objects.nonNull(stock.getReg_date())
//                && !"".equalsIgnoreCase(
//                String.valueOf(stock.getReg_date()))) {
//            userStock.setReg_date(
//                    stock.getReg_date());
//        }
//
//        return StockRepository.save(userStock);
//    }
}
