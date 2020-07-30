package com.example.vending.Inventory.repository;

import com.example.vending.Inventory.model.Cell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.List;

public interface CellRepository extends JpaRepository<Cell, Integer> {
    @Nullable
    Cell findFirstByCode(String code);

    @Nullable
    List<Cell> findAllByProductIdIsNotNull();
}
