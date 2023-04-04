package com.test.SymplificaTest.service;


import com.test.SymplificaTest.entity.Order;
import com.test.SymplificaTest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }


    public Order saveOrder( Order order){
        return orderRepository.save(order);
    }

    public List<Order> ordersList(){
        return orderRepository.findAll();
    }
}
