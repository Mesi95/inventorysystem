package com.example.inventorysystem.service;

import com.example.inventorysystem.model.Category;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface CategoryService {

    public Category saveCategory(Category category);
    public List<Category> getAllCategory();
    List<Category> fetchCategoryList();
    Category updateCategory(Category category, int category_id);
    // Read operation

}
