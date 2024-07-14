package com.fiap.techchallenge.fastfood.core.applications.services;

import com.fiap.techchallenge.fastfood.core.applications.ports.CategoryRepositoryPort;
import com.fiap.techchallenge.fastfood.core.domain.Category;

import java.util.List;

public class CategoryService {

    private final CategoryRepositoryPort categoryRepository;

    public CategoryService(CategoryRepositoryPort categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void insertCategory(Category category) {
        this.categoryRepository.insertCategory(category);
    }

    public void updateCategory(Long categoryId, Category category) {
        this.categoryRepository.updateCategory(categoryId, category);
    }

    public Category getCategoryById(Long id) {
        return this.categoryRepository.getCategoryById(id);
    }

    public List<Category> getAllCategories() {
        return this.categoryRepository.getAllCategories();
    }

}
