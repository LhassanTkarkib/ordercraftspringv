package com.orderCraftSpringApp.repository;

import com.orderCraftSpringApp.model.classes.Product;
import com.orderCraftSpringApp.model.classes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
