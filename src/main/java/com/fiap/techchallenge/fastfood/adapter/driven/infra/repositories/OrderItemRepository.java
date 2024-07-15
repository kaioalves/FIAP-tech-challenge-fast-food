package com.fiap.techchallenge.fastfood.adapter.driven.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.entities.OrderItemEntity;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long> {

}
