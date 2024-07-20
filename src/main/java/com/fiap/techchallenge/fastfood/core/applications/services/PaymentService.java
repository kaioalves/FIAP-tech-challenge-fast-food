package com.fiap.techchallenge.fastfood.core.applications.services;

import com.fiap.techchallenge.fastfood.core.applications.ports.PaymentRepositoryPort;
import com.fiap.techchallenge.fastfood.core.domain.Payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaymentService {

    private final PaymentRepositoryPort paymentRepositoryPort;

    public void insertPay(Payment payment) {
        this.paymentRepositoryPort.register(payment);
    }

}
