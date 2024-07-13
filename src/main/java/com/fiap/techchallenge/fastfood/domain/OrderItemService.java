package com.fiap.techchallenge.fastfood.domain;

public interface OrderItemService {

    void register(ProductService productService, OrderService orderService, Long price, int quantity);

    OrderItemService findByOrderId(Long orderId);
}
