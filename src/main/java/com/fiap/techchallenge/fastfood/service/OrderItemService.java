package com.fiap.techchallenge.fastfood.service;

import com.fiap.techchallenge.fastfood.domain.Order;
import com.fiap.techchallenge.fastfood.domain.OrderItem;
import com.fiap.techchallenge.fastfood.domain.Product;

import java.util.List;

public interface OrderItemService {

    void register(Product product, Order order, Long price, int quantity);

    List<OrderItem> findByOrderId(Long orderId);
}
