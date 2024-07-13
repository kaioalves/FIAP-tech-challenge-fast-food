package com.fiap.techchallenge.fastfood.domain;

public interface OrderService {

    void generateOrder(UserService userService, OrderItemService orderItemService);

    OrderService findByStatus(OrderStatus orderStatus);

    OrderService findById(Long orderId);

    OrderService findByUserId(Long userId);

}
