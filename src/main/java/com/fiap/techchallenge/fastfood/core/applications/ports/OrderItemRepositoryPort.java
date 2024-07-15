package com.fiap.techchallenge.fastfood.core.applications.ports;

import java.util.List;

import com.fiap.techchallenge.fastfood.core.domain.OrderItem;

public interface OrderItemRepositoryPort {

    OrderItem register(OrderItem orderItem);

    List<OrderItem> findByOrderId(Long orderId);

}
