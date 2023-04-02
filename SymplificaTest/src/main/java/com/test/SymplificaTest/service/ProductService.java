package com.test.SymplificaTest.service;


import com.test.SymplificaTest.entity.Product;
import com.test.SymplificaTest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    private ProductRepository productRepository;


    @Autowired
    public ProductService( ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    public List<Product> productsList(){
        return productRepository.findAll();
    }












}
