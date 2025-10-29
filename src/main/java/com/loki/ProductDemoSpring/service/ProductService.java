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


//    List<Product> products = new ArrayList<>();
//
////    ProductDB db = new ProductDB();
//
//    public ProductService() throws SQLException {
//    }
//
//    public void addProduct(Product product) {
////            products.add(product);
//            db.save(product);
//    }
//
//    public List<Product> getAllProducts() {
//        return db.getAll();
//    }
//
//    public List<Product> getProductByType(String type) {
//
//        List<Product> t = new ArrayList<>();
//
//        for(Product p:products){
//            if(p.getType().equals(type)){
//                t.add(p);
//            }
//        }
//
//        return t;
//    }

//    public List<Product> getOutOfWarranty() {
//        List<Product> o = products.stream()
//                .filter(p->p.getWarranty()<=2024)
//                .collect(Collectors.toList());
//
//
//
//        return o;
//    }
}
