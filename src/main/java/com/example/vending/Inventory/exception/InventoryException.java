package com.example.vending.Inventory.exception;

public abstract class InventoryException extends Exception {
    public InventoryException(String message) {
        super(message);
    }
}
