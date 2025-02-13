package com.example.spring_task_product_catalog_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // Marks this class as a JPA entity
@Table(name= "products")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)   // Auto-increment primary key
    private Long id;
    private String name;
    private double price;
    private String category;

}
