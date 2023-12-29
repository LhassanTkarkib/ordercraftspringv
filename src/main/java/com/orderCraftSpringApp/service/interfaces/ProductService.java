package com.orderCraftSpringApp.service.interfaces;
import com.orderCraftSpringApp.model.classes.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    Product getProductById(int id);

    Product getProductByName(String name);

    void saveProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Product product);

    boolean isProductExist(Product product);
}
