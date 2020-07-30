package com.example.vending.Inventory.controller;

import com.example.vending.Inventory.exception.CellOccupiedException;
import com.example.vending.Inventory.exception.WrongCellCodeException;
import com.example.vending.Inventory.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("maintenance")
public class MaintenanceController {
    @Autowired
    private CellService cellService;

    @GetMapping("/add-product")
    public String addProduct() throws WrongCellCodeException, CellOccupiedException {
        cellService.addProduct(1, "A1");
        return "OK";
    }

}
