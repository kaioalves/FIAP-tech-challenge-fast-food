package com.fiap.techchallenge.fastfood.adapter.driven.infra.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderItens")
public class OrderItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Long orderId;

    private Double price;
    private Integer quantity;
}
