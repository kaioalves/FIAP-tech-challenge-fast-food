package com.fiap.techchallenge.fastfood.domain;

import java.util.List;

public interface User {

    void register(String name, String email, String cpf);

    List<User> findAll();

    User findById(String userId);

    User findByEmail(String email);
}
