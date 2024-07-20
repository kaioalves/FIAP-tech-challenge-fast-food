package com.fiap.techchallenge.fastfood.core.applications.services;

import org.springframework.stereotype.Service;

import com.fiap.techchallenge.fastfood.core.applications.ports.repository.PaymentRepositoryPort;
import com.fiap.techchallenge.fastfood.core.applications.ports.services.PaymentServicePort;
import com.fiap.techchallenge.fastfood.core.domain.Payment;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentService implements PaymentServicePort{

    private final PaymentRepositoryPort paymentRepositoryPort;

    public Payment registerPay(Payment payment) {
        return  this.paymentRepositoryPort.registerPay(payment);
    }

}
