package com.orderCraftSpringApp.service.interfaces;
import com.orderCraftSpringApp.model.classes.StockMng;
import org.springframework.stereotype.Service;

@Service
public interface StockService {

    StockMng getStockById(int id);

    StockMng getStockByProductId(int productId);

    void saveStock(StockMng stock);

    StockMng updateStock(StockMng stock);

    void deleteStock(StockMng stock);

    boolean isStockExist(StockMng stock);


}
