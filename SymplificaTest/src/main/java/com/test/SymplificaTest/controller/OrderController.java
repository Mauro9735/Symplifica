package com.test.SymplificaTest.controller;

import com.test.SymplificaTest.entity.Order;
import com.test.SymplificaTest.service.OrderService;
import com.test.SymplificaTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    private ProductService productService;


    @Autowired
    public OrderController (OrderService orderService, ProductService productService){
        this.orderService = orderService;
        this.productService = productService;
    }


    @GetMapping()
    public String OrdersList(Model model){
        model.addAttribute("orders",orderService.ordersList());
        return "symplifica";
    }


    @GetMapping("/newOrder")
    public String createOrder(Model model){
        Order order = new Order();
        model.addAttribute("order",order);
        model.addAttribute("products",productService.productsList());
        return  "orderNew";
    }



//
    @PostMapping()
    public String saveOrder (@ModelAttribute("order") Order order){
        orderService.saveOrder(order);
        return "redirect:/orders";
    }


    @GetMapping("/{id}")
    public String deleteOrder(@PathVariable Integer id){
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }

}
