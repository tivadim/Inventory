package com.example.vending.Inventory.repository;

import com.example.vending.Inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
