package com.example.vending.Inventory.repository;

import com.example.vending.Inventory.model.Cell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellRepository extends JpaRepository<Cell, Integer> {

}
