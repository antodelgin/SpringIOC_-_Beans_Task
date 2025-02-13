package com.example.spring_task_product_catalog_system.repository;

import com.example.spring_task_product_catalog_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data JPA repository for Product entity
public interface ProductRepository extends JpaRepository<Product, Long> {

}
