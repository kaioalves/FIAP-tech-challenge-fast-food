package com.fiap.techchallenge.fastfood.adapter.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.techchallenge.fastfood.core.applications.services.PaymentService;
import com.fiap.techchallenge.fastfood.core.domain.Payment;

import java.net.URI;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> register(@RequestBody Payment payment) {
        Payment registredPayment = paymentService.registerPay(payment);

        /**
         * Forma adequada para retornar servços CREATED
         */
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(registredPayment.getId()).toUri();

        return ResponseEntity.created(uri).body(registredPayment);
    }

}
