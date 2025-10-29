package com.loki.ProductDemoSpring.controller;

import com.loki.ProductDemoSpring.module.Product;
import com.loki.ProductDemoSpring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductService ser;

    @GetMapping()
    public List<Product> getAllProducts(){
        return ser.getAllProducts();
    }

    @GetMapping("/{type}")
    public List<Product> getByType(@PathVariable("type") String type){
        return ser.getByType(type);
    }

    @PostMapping()
    public String addProducts(@RequestBody Product product){

        if(ser.addProduct(product)){
            return "Success";
        }

        return "Error";
    }

}
