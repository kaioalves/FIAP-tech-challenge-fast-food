package com.fiap.techchallenge.fastfood.domain;

public interface Product {

    void register(String name, String description, Category category, Double price);

    void update(String name, String description, Category category, Double price);

    Product findById(Long id);

    Product findByCategoryId(Long categoryId);

}
