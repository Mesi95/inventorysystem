package com.example.inventorysystem.service;
import com.example.inventorysystem.model.Category;
import com.example.inventorysystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository CategoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return CategoryRepository.save(category);
    }
    @Override
    public List<Category> getAllCategory() {
        return CategoryRepository.findAll();
    }
    @Override
    public List<Category> fetchCategoryList()
    {
        return (List<Category>)
                CategoryRepository.findAll();
    }
    @Override
    public Category
    updateCategory(Category category, int category_id)
    {
        Category prodC
                = CategoryRepository.findById(category_id)
                .get();
        if (Objects.nonNull(category.getCategory_name())
                && !"".equalsIgnoreCase(
                category.getCategory_name())) {
            prodC.setCategory_name(
                    category.getCategory_name());
        }

        if (Objects.nonNull(
                category.getProduct_type())
                && !"".equalsIgnoreCase(
                category.getProduct_type())) {
            prodC.setProduct_type(
                    category.getProduct_type());
        }

        if (Objects.nonNull(category.getDescription())
                && !"".equalsIgnoreCase(
                category.getDescription())) {
            prodC.setDescription(
                    category.getDescription());
        }

        return CategoryRepository.save(prodC);
    }
}
