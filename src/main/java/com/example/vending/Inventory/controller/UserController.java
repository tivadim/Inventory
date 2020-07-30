package com.example.vending.Inventory.controller;

import com.example.vending.Inventory.exception.WrongCellCodeException;
import com.example.vending.Inventory.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private CellService cellService;

    @PostMapping("/pop-product")
    public void removeProducts(@RequestParam String cellCode) throws WrongCellCodeException {
        cellService.removeProducts(cellCode, 1);
    }
}
