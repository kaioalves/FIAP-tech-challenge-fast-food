package com.fiap.techchallenge.fastfood.core.applications.ports;

import com.fiap.techchallenge.fastfood.core.domain.Category;

import java.util.List;

public interface CategoryRepositoryPort {

   void insertCategory(Category category);

   void updateCategory(Long categoryId, Category category);

   Category getCategoryById(Long id);

   List<Category> getAllCategories();

}
