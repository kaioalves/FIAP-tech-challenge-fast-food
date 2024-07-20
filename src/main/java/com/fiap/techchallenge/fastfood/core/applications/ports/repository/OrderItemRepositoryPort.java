package com.fiap.techchallenge.fastfood.core.applications.ports.repository;

import java.util.List;

import com.fiap.techchallenge.fastfood.core.domain.OrderItem;

public interface OrderItemRepositoryPort {

    void register(OrderItem orderItem);

    List<OrderItem> findByOrderId(Long orderId);

}
