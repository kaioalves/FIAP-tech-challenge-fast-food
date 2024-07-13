package com.fiap.techchallenge.fastfood.domain;

public interface Order {

    void generateOrder(User user, OrderItem orderItem);

    Order findByStatus(OrderStatus orderStatus);

    Order findById(Long orderId);

    Order findByUserId(Long userId);

}
