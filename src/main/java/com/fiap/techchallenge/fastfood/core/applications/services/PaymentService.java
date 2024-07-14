package com.fiap.techchallenge.fastfood.core.applications.services;

import com.fiap.techchallenge.fastfood.core.domain.Order;

public interface PaymentService {

    void pay(Order order);

}
