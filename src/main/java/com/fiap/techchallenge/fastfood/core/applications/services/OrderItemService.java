package com.fiap.techchallenge.fastfood.core.applications.services;

import java.util.List;

import com.fiap.techchallenge.fastfood.core.applications.ports.OrderItemRepositoryPort;
import com.fiap.techchallenge.fastfood.core.domain.OrderItem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderItemService {

    private final OrderItemRepositoryPort orderItemRepositoryPort;

    public void insertOrderItens(List<OrderItem> orderItens) {
        for (OrderItem orderItem : orderItens) {
            this.orderItemRepositoryPort.register(orderItem);
        }
    }

    public List<OrderItem> getByOrderId(Long orderId) {
        return this.orderItemRepositoryPort.findByOrderId(orderId);
    }

}
