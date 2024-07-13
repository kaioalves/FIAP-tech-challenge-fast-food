package com.fiap.techchallenge.fastfood.service;

import com.fiap.techchallenge.fastfood.domain.User;

import java.util.List;

public interface UserService {

    void register(String name, String email, String cpf);

    List<User> findAll();

    User findById(String userId);

    User findByEmail(String email);
}
