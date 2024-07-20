CREATE TABLE payment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    external_reference VARCHAR(255) NOT NULL,
    order_id BIGINT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id)
);