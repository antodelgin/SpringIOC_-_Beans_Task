package com.example.spring_task_product_catalog_system.controller;


import com.example.spring_task_product_catalog_system.entity.Product;
import com.example.spring_task_product_catalog_system.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;  // Service layer dependency


    // Handles the root URL and returns the home page
    @GetMapping
    public String home(){
        return "index";
    }

    // Displays the "Add Product" form
    @GetMapping("/add-product")
    public String showAddProductForm(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "add-product";
    }

    // Handles form submission for adding a product
    @PostMapping("/save-product")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }

    // Displays the list of all products
    @GetMapping("/display-products")
    public String getAllProducts(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products",products);
        return "display-products";
    }
}
