package com.example.vending.Inventory.service;

import com.example.vending.Inventory.exception.CellOccupiedException;
import com.example.vending.Inventory.exception.WrongCellCodeException;
import com.example.vending.Inventory.model.Cell;
import com.example.vending.Inventory.repository.CellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CellServiceImpl implements CellService{

    @Autowired
    private CellRepository cellRepository;

    @Override
    public void addProducts(String code, int productId, int count) throws WrongCellCodeException, CellOccupiedException {
        Cell cell = cellRepository.findFirstByCode(code);
        if (cell == null) {
            throw new WrongCellCodeException(code);
        }

        if (cell.getProductId() == null) {
            cell.setProductId(productId);
            cell.setProductCount(count);
        } else {
            if (cell.getProductId() != productId)
                throw new CellOccupiedException();
            else {
                cell.setProductCount(cell.getProductCount() + 1);
            }
        }
        cellRepository.save(cell);
    }

    @Override
    public void removeProducts(String code, int count) throws WrongCellCodeException {
        Cell cell = cellRepository.findFirstByCode(code);
        if (cell == null) {
            throw new WrongCellCodeException(code);
        }
        cell.setProductCount(Math.max(cell.getProductCount() - count, 0));
        if (cell.getProductCount() == 0) {
            cell.setProductId(null);
        }
        cellRepository.save(cell);
    }

    @Override
    public List<Cell> getCells() {
        return cellRepository.findAll();
    }

    @Override
    public Map<Integer, Integer> getProductCount() {
        List<Cell> occupiedCells = cellRepository.findAllByProductIdIsNotNull();
        return occupiedCells != null ? occupiedCells.stream().collect(
                Collectors.groupingBy(Cell::getProductId, Collectors.summingInt(Cell::getProductCount))) : null;
    }


}
