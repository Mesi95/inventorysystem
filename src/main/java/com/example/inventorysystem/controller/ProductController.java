package com.example.inventorysystem.controller;

import com.example.inventorysystem.model.Category;
import com.example.inventorysystem.model.Product;
import com.example.inventorysystem.repository.CategoryRepository;
import com.example.inventorysystem.repository.ProductRepository;
import com.example.inventorysystem.service.CategoryService;
import com.example.inventorysystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;
    @PutMapping("/{product_id}/category/{category_id}")
    Product RegiserCategoryToProduct(
            @PathVariable int product_id,
            @PathVariable int category_id
    ){
        Product product = productRepository.findById(product_id).get();
        Category category = categoryRepository.findById(category_id).get();
        product.assignCategory(category);
        return productRepository.save(product);
    }
}
