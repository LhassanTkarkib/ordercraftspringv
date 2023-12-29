package com.orderCraftSpringApp.service.implementations;


import com.orderCraftSpringApp.model.classes.StockMng;
import com.orderCraftSpringApp.service.interfaces.StockService;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
    @Override
    public StockMng getStockById(int id) {
        return null;
    }

    @Override
    public StockMng getStockByProductId(int productId) {
        return null;
    }

    @Override
    public void saveStock(StockMng stock) {

    }

    @Override
    public StockMng updateStock(StockMng stock) {
        return null;
    }

    @Override
    public void deleteStock(StockMng stock) {

    }

    @Override
    public boolean isStockExist(StockMng stock) {
        return false;
    }
}
