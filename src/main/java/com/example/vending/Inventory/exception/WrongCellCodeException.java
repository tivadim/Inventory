package com.example.vending.Inventory.exception;

public class WrongCellCodeException extends InventoryException {
    public WrongCellCodeException(String code) {
        super(String.format("Wrong cell code '%s'", code));
    }
}
