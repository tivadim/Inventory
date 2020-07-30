package com.example.vending.Inventory.controller;

import com.example.vending.Inventory.model.Product;
import com.example.vending.Inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/add")
    public List<Product> addProduct() {
        Product p = new Product();
        productRepository.save(p);
        return productRepository.findAll();
    }
}
