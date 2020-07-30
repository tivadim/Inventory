package com.example.vending.Inventory.exception;

public class CellOccupiedException extends InventoryException {
    public CellOccupiedException() {
        super("Another product already in place");
    }
}
