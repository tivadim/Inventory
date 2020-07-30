package com.example.vending.Inventory.service;

import com.example.vending.Inventory.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    void updateProduct(Product product);

    Product getProduct(Integer id);

    void deleteProduct(Integer id);

    List<Product> getAllProducts();
}
