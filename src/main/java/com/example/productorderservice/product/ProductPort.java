package com.example.productorderservice.product;

public interface ProductPort {
    void save(Product product);

    Product getProduct(long productId);
}
