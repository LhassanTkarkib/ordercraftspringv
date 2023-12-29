package com.orderCraftSpringApp.model.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productID")
    private Long productID;

    @Column(name="productName")
    private String productName;

    @Column(name="productDescription")
    private String productDescription;

    @Column(name="productPrice")
    private Double productPrice;

    @Column(name="quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name="stockManagerID", nullable = false)
    private StockMng stockmng;

    public Product(String productName, String productDescription, Double productPrice, Integer quantity, StockMng stockmng) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.stockmng = stockmng;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public StockMng getStockmng() {
        return stockmng;
    }

    public void setStockmng(StockMng stockmng) {
        this.stockmng = stockmng;
    }
}