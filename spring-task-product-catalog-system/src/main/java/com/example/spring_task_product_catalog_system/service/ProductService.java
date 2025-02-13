package com.example.spring_task_product_catalog_system.service;

import com.example.spring_task_product_catalog_system.entity.Product;

import java.util.List;

// Interface for Product service
public interface ProductService {

    Product saveProduct(Product product);  // Method to save a product
    List<Product> getAllProducts();  // Method to retrieve all products

}
