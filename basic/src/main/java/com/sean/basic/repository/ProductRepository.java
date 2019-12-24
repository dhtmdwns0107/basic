package com.sean.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sean.basic.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}