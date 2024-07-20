package com.fiap.techchallenge.fastfood.adapter.driven.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.mappers.PaymentMapper;
import com.fiap.techchallenge.fastfood.adapter.driven.infra.repositories.PaymentRepository;
import com.fiap.techchallenge.fastfood.core.applications.ports.PaymentRepositoryPort;
import com.fiap.techchallenge.fastfood.core.domain.Payment;

@Component
public class PaymentJpaPort implements PaymentRepositoryPort {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void register(Payment payment) {
        this.paymentRepository.save(PaymentMapper.toEntity(payment));
    }

}
