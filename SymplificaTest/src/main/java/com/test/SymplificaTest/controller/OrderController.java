package com.test.SymplificaTest.controller;

import com.test.SymplificaTest.entity.Order;
import com.test.SymplificaTest.service.OrderService;
import com.test.SymplificaTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    private ProductService productService;


    @Autowired
    public OrderController (OrderService orderService, ProductService productService){
        this.orderService = orderService;
        this.productService = productService;
    }


    @GetMapping
    public ResponseEntity<List<Order>> OrdersList(){
        return ResponseEntity.ok(orderService.ordersList());
    }

    @PostMapping
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.saveOrder(order));
    }


}
