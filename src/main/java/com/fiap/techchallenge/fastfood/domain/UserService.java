package com.fiap.techchallenge.fastfood.domain;

import java.util.List;

public interface UserService {

    void register(String name, String email, String cpf);

    List<UserService> findAll();

    UserService findById(String userId);

    UserService findByEmail(String email);
}
