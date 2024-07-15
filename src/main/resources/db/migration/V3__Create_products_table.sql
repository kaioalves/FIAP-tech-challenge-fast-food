-- V3__Create_products_table

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price FLOAT NOT NULL,
    category_id INT NOT NULL FOREIGN KEY REFERENCES categories(id)
);
