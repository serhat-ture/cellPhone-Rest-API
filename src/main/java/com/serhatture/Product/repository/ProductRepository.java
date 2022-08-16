package com.serhatture.Product.repository;

import com.serhatture.Product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
