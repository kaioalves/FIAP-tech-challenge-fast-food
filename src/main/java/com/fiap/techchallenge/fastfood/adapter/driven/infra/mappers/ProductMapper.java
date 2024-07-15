package com.fiap.techchallenge.fastfood.adapter.driven.infra.mappers;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.entities.ProductEntity;
import com.fiap.techchallenge.fastfood.core.domain.Product;

public class ProductMapper {

    public static Product toDomain(ProductEntity productEntity) {
        if(productEntity == null) {
            return null;
        }

        return new Product(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getCategory(),
                productEntity.getPrice()
        );
    }

    public static ProductEntity toEntity(Product product) {
        if(product == null) {
            return null;
        }

        return new ProductEntity(
                product.getId(),
                product.getName(),
                product.getCategory(),
                product.getPrice()
        );
    }

}
