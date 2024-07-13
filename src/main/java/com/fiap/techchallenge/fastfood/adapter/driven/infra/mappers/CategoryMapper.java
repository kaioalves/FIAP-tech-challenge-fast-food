package com.fiap.techchallenge.fastfood.adapter.driven.infra.mappers;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.entities.CategoryEntity;
import com.fiap.techchallenge.fastfood.core.domain.Category;

public class CategoryMapper {

    public static Category toDomain(CategoryEntity categoryEntity) {
        return new Category(
                categoryEntity.getId(),
                categoryEntity.getDescription()
        );
    }

    public static CategoryEntity toEntity(Category category) {
        return new CategoryEntity(
                category.getId(),
                category.getDescription()
        );
    }
}
