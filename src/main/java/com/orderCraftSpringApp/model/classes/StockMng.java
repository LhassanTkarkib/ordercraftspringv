package com.orderCraftSpringApp.model.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stock")
public class StockMng {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stockManagerID")
    private Long stockManagerID;

    @OneToMany(mappedBy = "stockmng", cascade = CascadeType.ALL)
    private List<Product> products;

    public Long getStockManagerID() {
        return stockManagerID;
    }

    public void setStockManagerID(Long stockManagerID) {
        this.stockManagerID = stockManagerID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
