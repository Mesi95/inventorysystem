package com.example.inventorysystem.controller;

import com.example.inventorysystem.model.Category;
import com.example.inventorysystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public String add(@RequestBody Category category){
        categoryService.saveCategory(category);
        return "New Category Added";
    }
    @GetMapping("/getAll")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }
    @GetMapping("/All")
    public List<Category> fetchCategoryList()
    {
        return categoryService.fetchCategoryList();
    }
    @PutMapping("/{category_id}")
    public Category
    updateProductCategory(@RequestBody Category category,
                     @PathVariable("category_id") int category_id)
    {
        return categoryService.updateCategory(
                category, category_id);
    }

}
