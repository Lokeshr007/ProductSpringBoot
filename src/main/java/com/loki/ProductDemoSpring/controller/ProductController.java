package com.loki.ProductDemoSpring.controller;

import com.loki.ProductDemoSpring.module.Product;
import com.loki.ProductDemoSpring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService ser;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return ser.getAllProducts();
    }

    @GetMapping("/product/{type}")
    public List<Product> getByType(@PathVariable("type") String type){
        return ser.getByType(type);
    }


}
