package com.test.SymplificaTest.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String price;

    @Column
    private Integer currentStock;

    @OneToMany(mappedBy ="product",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Order> orders = new HashSet<>();


    public Product(Integer id, String name, String description, String price, Integer currentStock){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.currentStock = currentStock;
    }


    public Product(String name, String description, String price, Integer currentStock){
        this.name = name;
        this.description = description;
        this.price = price;
        this.currentStock = currentStock;
    }

    public Product(){

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
