package com.fiap.techchallenge.fastfood.adapter.driven.infra.repositories.jpa;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.entities.CategoryEntity;
import com.fiap.techchallenge.fastfood.adapter.driven.infra.mappers.CategoryMapper;
import com.fiap.techchallenge.fastfood.adapter.driven.infra.repositories.CategoryRepository;
import com.fiap.techchallenge.fastfood.core.applications.ports.CategoryRepositoryPort;
import com.fiap.techchallenge.fastfood.core.domain.Category;

import java.util.List;

public class CategoryJpaPort implements CategoryRepositoryPort {

    private CategoryRepository categoryRepository;

    public CategoryJpaPort(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void insertCategory(Category category) {
        this.categoryRepository.save(CategoryMapper.toEntity(category));
    }

    @Override
    public void updateCategory(Long categoryId, Category category) {
        this.categoryRepository.save(CategoryMapper.toEntity(category));
    }

    @Override
    public Category getCategoryById(Long id) {
        CategoryEntity categoryEntity = this.categoryRepository.findById(id).get();
        return CategoryMapper.toDomain(categoryEntity);
    }

    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }
}
