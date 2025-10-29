package com.loki.ProductDemoSpring.service;

import com.loki.ProductDemoSpring.module.Product;
import com.loki.ProductDemoSpring.repository.ProductDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
public class ProductService {


    @Autowired
    ProductDB db;

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public List<Product> getByType(String type) {
        return db.findAllByType(type);
    }


    public boolean addProduct(Product product) {
        Product savedProduct = db.save(product);
        return savedProduct != null;  // return true if saved successfully
    }


}
