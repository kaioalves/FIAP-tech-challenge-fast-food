package com.fiap.techchallenge.fastfood.core.applications.services;

import com.fiap.techchallenge.fastfood.core.domain.Order;
import com.fiap.techchallenge.fastfood.core.domain.OrderItem;
import com.fiap.techchallenge.fastfood.core.domain.Product;

import java.util.List;

public interface OrderItemService {

    void register(Product product, Order order, Long price, int quantity);

    List<OrderItem> findByOrderId(Long orderId);
}
