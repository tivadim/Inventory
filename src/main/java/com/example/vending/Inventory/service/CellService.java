package com.example.vending.Inventory.service;

import com.example.vending.Inventory.exception.CellOccupiedException;
import com.example.vending.Inventory.exception.WrongCellCodeException;
import com.example.vending.Inventory.model.Cell;

import java.util.List;
import java.util.Map;

public interface CellService {
    void addProducts(String code, int productId, int count) throws WrongCellCodeException, CellOccupiedException;

    void removeProducts(String code, int count) throws WrongCellCodeException;

    List<Cell> getCells();

    Map<Integer, Integer> getProductCount();
}
