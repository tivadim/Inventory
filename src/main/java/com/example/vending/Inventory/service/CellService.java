package com.example.vending.Inventory.service;

import com.example.vending.Inventory.exception.CellOccupiedException;
import com.example.vending.Inventory.exception.WrongCellCodeException;

public interface CellService {
    void addProducts(String code, int count, int productId) throws WrongCellCodeException, CellOccupiedException;

    void removeProducts(String code, int count) throws WrongCellCodeException;
}
