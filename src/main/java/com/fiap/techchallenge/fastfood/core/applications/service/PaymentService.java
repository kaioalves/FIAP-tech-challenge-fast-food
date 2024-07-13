package com.fiap.techchallenge.fastfood.core.applications.service;

import com.fiap.techchallenge.fastfood.core.domain.Order;

public interface PaymentService {

    void pay(Order order);

}
