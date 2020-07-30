package com.example.vending.Inventory.controller;

import com.example.vending.Inventory.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("report")
public class ReportController {
    @Autowired
    private CellService cellService;

    @PostMapping("/products")
    public Map<Integer, Integer> getProducts() {
        return cellService.getProductCount();
    }
}
