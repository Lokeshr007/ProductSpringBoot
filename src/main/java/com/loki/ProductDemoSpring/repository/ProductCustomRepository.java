package com.loki.ProductDemoSpring.repository;

import com.loki.ProductDemoSpring.module.Product;

import java.util.List;

public interface ProductCustomRepository {

    List<Product> getProductsWithWarranty(int warranty);

    List<Product> getProductsWithWarrantyAbove(int years);

    List<Product> getProductsInPlace(String place);
}
