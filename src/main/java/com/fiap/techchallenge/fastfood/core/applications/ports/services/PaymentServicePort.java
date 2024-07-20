package com.fiap.techchallenge.fastfood.core.applications.ports.services;

import com.fiap.techchallenge.fastfood.core.domain.Payment;

public interface PaymentServicePort {

    Payment registerPay(Payment payment);
    
}
