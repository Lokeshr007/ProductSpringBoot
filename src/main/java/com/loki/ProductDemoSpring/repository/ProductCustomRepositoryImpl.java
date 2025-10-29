package com.loki.ProductDemoSpring.repository;

import com.loki.ProductDemoSpring.module.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class ProductCustomRepositoryImpl implements ProductCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getProductsWithWarrantyAbove(int years) {
        String jpql = "SELECT p FROM Product p WHERE p.warranty >= :years";
        TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
        query.setParameter("years", years);
        return query.getResultList();
    }

    @Override
    public List<Product> getProductsInPlace(String place) {
        String jpql = "SELECT p FROM Product p WHERE p.place = :place";
        TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
        query.setParameter("place", place);
        return query.getResultList();
    }
}
