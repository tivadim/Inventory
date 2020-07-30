package com.example.vending.Inventory.controller;

import com.example.vending.Inventory.exception.CellOccupiedException;
import com.example.vending.Inventory.exception.WrongCellCodeException;
import com.example.vending.Inventory.model.Cell;
import com.example.vending.Inventory.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("maintenance")
public class MaintenanceController {
    @Autowired
    private CellService cellService;

    @PostMapping("/add-products")
    public void addProducts(@RequestParam String cellCode, @RequestParam Integer productId, @RequestParam Integer count)
            throws WrongCellCodeException, CellOccupiedException {
        cellService.addProducts(cellCode, productId, count);
    }

    @PostMapping("/remove-products")
    public void removeProducts(@RequestParam String cellCode, @RequestParam Integer count)
            throws WrongCellCodeException {
        cellService.removeProducts(cellCode, count);
    }

    @GetMapping("/inventory")
    public List<Cell> getInventory() {
        return cellService.getCells();
    }

}
