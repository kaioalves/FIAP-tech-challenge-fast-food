package com.fiap.techchallenge.fastfood.adapter.driven.infra.mappers;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.entities.PaymentEntity;
import com.fiap.techchallenge.fastfood.core.domain.Payment;

public class PaymentMapper {
    
    public static Payment toDomain(PaymentEntity paymentEntity) {
        if (paymentEntity == null) {
            return null;
        }

        return new Payment(
            paymentEntity.getId(), 
            paymentEntity.getExternalReference(), 
            paymentEntity.getOrderId(), 
            paymentEntity.getCreatedAt()
        );
    }

    public static PaymentEntity toEntity(Payment payment) {
        if (payment == null) {
            return null;
        }

        return new PaymentEntity(
            payment.getId(),
            payment.getOrderId(),
            payment.getExternalReference(),
            payment.getCreatedAt()
        );
    }
}
