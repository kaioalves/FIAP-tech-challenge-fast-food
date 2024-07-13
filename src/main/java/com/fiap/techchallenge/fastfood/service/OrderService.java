package com.fiap.techchallenge.fastfood.service;

import com.fiap.techchallenge.fastfood.domain.Order;
import com.fiap.techchallenge.fastfood.domain.OrderItem;
import com.fiap.techchallenge.fastfood.domain.OrderStatus;
import com.fiap.techchallenge.fastfood.domain.User;

import java.util.List;

public interface OrderService {

    void generateOrder(User user, OrderItem orderItem);

    List<Order> findByStatus(OrderStatus orderStatus);

    Order findById(Long orderId);

    List<Order> findByUserId(Long userId);

}
