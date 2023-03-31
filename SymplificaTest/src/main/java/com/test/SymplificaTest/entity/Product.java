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

    @OneToMany(mappedBy = "products",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Product> products = new HashSet<>();


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


}
