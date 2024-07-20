package com.fiap.techchallenge.fastfood.core.domain;

import java.util.Date;

public class Payment {

    private Long id;
    private String externalReference;
    private Long orderId;
    private Date createdAt;

    public Payment(Long id, String externalReference, Long orderId, Date createdAt) {
        this.id = id;
        this.externalReference = externalReference;
        this.orderId = orderId;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getExternalReference() {
        return externalReference;
    }
    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
