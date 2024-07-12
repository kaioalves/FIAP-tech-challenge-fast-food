package com.fiap.techchallenge.fastfood.domain;

public interface OrderItem {

    void register(Product product, Order order, Long price, int quantity);

    OrderItem findByOrderId(Long orderId);
}
