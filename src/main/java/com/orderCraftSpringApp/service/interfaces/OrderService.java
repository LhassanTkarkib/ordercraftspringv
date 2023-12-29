package com.orderCraftSpringApp.service.interfaces;
import com.orderCraftSpringApp.model.classes.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    Order createOrder(Order order);

    Order getOrderById(Long id);

    Order updateOrder(Order order);

    void deleteOrder(Order order);

    boolean isOrderExist(Order order);

}
