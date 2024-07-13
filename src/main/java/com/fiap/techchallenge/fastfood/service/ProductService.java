package com.fiap.techchallenge.fastfood.service;

import com.fiap.techchallenge.fastfood.domain.Category;
import com.fiap.techchallenge.fastfood.domain.Product;

import java.util.List;

public interface ProductService {

    void register(String name, String description, Category category, Double price);

    void update(String name, String description, Category category, Double price);

    Product findById(Long id);

    List<Product> findByCategoryId(Long categoryId);

}
