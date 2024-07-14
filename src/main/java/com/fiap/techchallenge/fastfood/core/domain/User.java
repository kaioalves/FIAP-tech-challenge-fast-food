package com.fiap.techchallenge.fastfood.core.domain;

import java.util.Date;

public class User {

    private Long id;
    private String name;
    private String email;
    private String cpf;
    private Date createdAt;

    public User(Long id, String name, String email, String cpf, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
