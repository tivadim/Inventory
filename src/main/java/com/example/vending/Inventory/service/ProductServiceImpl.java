package com.example.vending.Inventory.service;

import com.example.vending.Inventory.model.Product;
import com.example.vending.Inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        repository.save(product);
    }

    @Override
    public Product getProduct(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
