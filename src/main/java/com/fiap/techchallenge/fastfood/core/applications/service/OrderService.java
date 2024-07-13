package com.fiap.techchallenge.fastfood.core.applications.service;

import com.fiap.techchallenge.fastfood.core.domain.Order;
import com.fiap.techchallenge.fastfood.core.domain.OrderItem;
import com.fiap.techchallenge.fastfood.core.domain.OrderStatus;
import com.fiap.techchallenge.fastfood.core.domain.User;

import java.util.List;

public interface OrderService {

    void generateOrder(User user, OrderItem orderItem);

    List<Order> findByStatus(OrderStatus orderStatus);

    Order findById(Long orderId);

    List<Order> findByUserId(Long userId);

}
