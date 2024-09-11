package com.application.tutorial.service;

import com.application.tutorial.entity.Category;
import com.application.tutorial.repository.CategoryRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService
{
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories()
    {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id)
    {
        return categoryRepository.findById(id).orElseThrow
                (
                        () -> new RuntimeException("Category not found")
                );
    }

    public void addCategory(Category category)
    {
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id)
    {
        categoryRepository.deleteById(id);
    }

    public void updateCategory(@NonNull Category category, Long id)
    {
        category.setId(id);
        categoryRepository.save(category);
    }
}
