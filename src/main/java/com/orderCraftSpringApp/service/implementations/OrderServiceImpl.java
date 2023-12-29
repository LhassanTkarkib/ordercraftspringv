package com.orderCraftSpringApp.service.implementations;

import com.orderCraftSpringApp.model.classes.Order;
import com.orderCraftSpringApp.service.interfaces.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public Order getOrderById(Long id) {
        return null;
    }

    @Override
    public Order updateOrder(Order order) {
        return null;
    }

    @Override
    public void deleteOrder(Order order) {

    }

    @Override
    public boolean isOrderExist(Order order) {
        return false;
    }
}
