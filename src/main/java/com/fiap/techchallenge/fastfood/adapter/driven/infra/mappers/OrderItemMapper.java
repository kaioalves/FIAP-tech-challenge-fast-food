package com.fiap.techchallenge.fastfood.adapter.driven.infra.mappers;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.entities.OrderItemEntity;
import com.fiap.techchallenge.fastfood.core.domain.OrderItem;

public class OrderItemMapper {

    public static OrderItem toDomain(OrderItemEntity orderItemEntity) {
        if (orderItemEntity == null) {
            return null;
        }

        return new OrderItem(
            orderItemEntity.getId(),
            orderItemEntity.getProductId(),
            orderItemEntity.getOrderId(),
            orderItemEntity.getPrice(),
            orderItemEntity.getQuantity()
        );
    }

    public static OrderItemEntity toEntity(OrderItem orderItem) {
        if (orderItem == null) {
            return null;
        }

        return new OrderItemEntity(
            orderItem.getId(),
            orderItem.getProductId(),
            orderItem.getOrderId(),
            orderItem.getPrice(),
            orderItem.getQuantity()
        );
    }

}

