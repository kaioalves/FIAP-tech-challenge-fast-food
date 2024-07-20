package com.fiap.techchallenge.fastfood.core.applications.ports.repository;

import com.fiap.techchallenge.fastfood.core.domain.Payment;

public interface PaymentRepositoryPort {

    Payment registerPay(Payment payment);

}
