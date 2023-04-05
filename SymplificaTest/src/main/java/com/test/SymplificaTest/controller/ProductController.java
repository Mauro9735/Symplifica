package com.test.SymplificaTest.controller;


import com.test.SymplificaTest.entity.Product;
import com.test.SymplificaTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController (ProductService productService){
        this.productService=productService;
    }

    @GetMapping()
    public String listProducts(Model model){
        model.addAttribute("products",productService.productsList());
        return "getProducts";
    }


}
