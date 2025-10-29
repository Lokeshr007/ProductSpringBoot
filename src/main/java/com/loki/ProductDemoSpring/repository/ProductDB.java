package com.loki.ProductDemoSpring.repository;

import com.loki.ProductDemoSpring.module.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB  extends JpaRepository<Product,Integer> ,ProductCustomRepository,ProductCustomRepositoryImpl{
    List<Product> findAllByType(String type);
}
