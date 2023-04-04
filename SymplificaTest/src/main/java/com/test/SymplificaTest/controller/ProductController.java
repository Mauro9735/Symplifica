package com.test.SymplificaTest.controller;


import com.test.SymplificaTest.entity.Product;
import com.test.SymplificaTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController (ProductService productService){
        this.productService=productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> productsList(){
        return ResponseEntity.ok(productService.productsList());
    }


}
