package com.fiap.techchallenge.fastfood.adapter.driver;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.techchallenge.fastfood.core.applications.ports.UserRepositoryPort;
import com.fiap.techchallenge.fastfood.core.domain.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepositoryPort userRepositoryPort;

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user) {
        User createdUser = userRepositoryPort.register(user);

        /**
         * Forma adequada para retornar servços CREATED
         */
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdUser.getId()).toUri();

        return ResponseEntity.created(uri).body(createdUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userRepositoryPort.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userRepositoryPort.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @GetMapping("/email")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        User user = userRepositoryPort.findByEmail(email);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
