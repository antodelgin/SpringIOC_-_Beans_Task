package com.example.spring_task_product_catalog_system.service.impl;

import com.example.spring_task_product_catalog_system.entity.Product;
import com.example.spring_task_product_catalog_system.repository.ProductRepository;
import com.example.spring_task_product_catalog_system.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service    // Marks this class as a Spring service component
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {

        return productRepository.save(product);  // Saves product to database
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();  // Retrieves all products
    }
}
