package com.orderCraftSpringApp.model.classes;
import com.orderCraftSpringApp.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private Long orderID;

    @Column(name = "orderDate")
    private String orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "orderStatus")
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private User orderClient;


    @ManyToMany
    @JoinTable(
            name = "order_line",
            joinColumns = @JoinColumn(name = "orderID"),
            inverseJoinColumns = @JoinColumn(name = "productID")
    )
    private List<Product> Products;

    public Order(String orderDate, OrderStatus orderStatus, User orderClient) {
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderClient = orderClient;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(User orderClient) {
        this.orderClient = orderClient;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }
}
