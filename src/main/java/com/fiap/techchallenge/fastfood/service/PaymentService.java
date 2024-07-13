package com.fiap.techchallenge.fastfood.service;

import com.fiap.techchallenge.fastfood.domain.Order;

public interface PaymentService {

    void pay(Order order);

}
