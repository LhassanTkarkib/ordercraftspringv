package com.orderCraftSpringApp.service.implementations;

import com.orderCraftSpringApp.model.classes.Product;
import com.orderCraftSpringApp.service.interfaces.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }

    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public boolean isProductExist(Product product) {
        return false;
    }
}
