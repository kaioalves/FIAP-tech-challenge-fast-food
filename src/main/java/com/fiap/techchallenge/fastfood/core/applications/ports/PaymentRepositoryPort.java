package com.fiap.techchallenge.fastfood.core.applications.ports;

import com.fiap.techchallenge.fastfood.core.domain.Payment;

public interface PaymentRepositoryPort {

    void register(Payment payment);

}
