CREATE TABLE orderItens (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    productId BIGINT NOT NULL,
    orderId BIGINT NOT NULL,
    price DOUBLE NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY (productId) REFERENCES products(id),
    FOREIGN KEY (orderId) REFERENCES orders(id)
);
