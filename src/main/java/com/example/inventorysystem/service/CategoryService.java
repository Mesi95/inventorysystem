package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Category;

import java.util.List;

public interface CategoryService {

    public Category saveCategory(Category category);
    public List<Category> getAllCategory();
    List<Category> fetchCategoryList();
    Category updateCategory(Category category, int category_id);
    // Read operation

}
