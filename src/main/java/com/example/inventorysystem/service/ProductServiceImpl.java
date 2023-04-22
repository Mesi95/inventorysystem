package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Product;
import com.example.inventorysystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
   private ProductRepository ProductRepository;
    @Override
    public Product saveProduct(Product product) {
        return ProductRepository.save(product);
    }
    @Override
    public List<Product> getAllProduct() {
        return ProductRepository.findAll();
    }
    @Override
    public List<Product> fetchProductList()
    {
        return (List<Product>)
                ProductRepository.findAll();
    }
}
