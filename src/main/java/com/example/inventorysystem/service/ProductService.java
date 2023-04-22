package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProduct();
    List<Product> fetchProductList();

}
