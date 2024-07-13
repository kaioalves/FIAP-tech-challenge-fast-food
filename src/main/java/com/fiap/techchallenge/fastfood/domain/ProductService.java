package com.fiap.techchallenge.fastfood.domain;

public interface ProductService {

    void register(String name, String description, CategoryService categoryService, Double price);

    void update(String name, String description, CategoryService categoryService, Double price);

    ProductService findById(Long id);

    ProductService findByCategoryId(Long categoryId);

}
