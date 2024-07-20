package com.fiap.techchallenge.fastfood.adapter.driven.infra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fiap.techchallenge.fastfood.adapter.driven.infra.entities.OrderItemEntity;
import com.fiap.techchallenge.fastfood.adapter.driven.infra.mappers.OrderItemMapper;
import com.fiap.techchallenge.fastfood.adapter.driven.infra.repositories.OrderItemRepository;
import com.fiap.techchallenge.fastfood.core.applications.ports.repository.OrderItemRepositoryPort;
import com.fiap.techchallenge.fastfood.core.domain.OrderItem;

import java.util.stream.Collectors;

@Component
public class OrderItemJpaPort implements OrderItemRepositoryPort{

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void register(OrderItem orderItem) {
        this.orderItemRepository.save(OrderItemMapper.toEntity(orderItem));
    }

    @Override
    public List<OrderItem> findByOrderId(Long orderId) {
        List<OrderItemEntity> orderItens = 
            this.orderItemRepository.findByOrderId(orderId);

        return orderItens.stream().map(OrderItemMapper::toDomain).collect(Collectors.toList());
    }

}
