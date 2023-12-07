// src/main/java/com/example/onlineshop/controller/ProductController.java
package com.example.onlineshop.controller;

import com.example.onlineshop.model.Product;
import com.example.onlineshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String listProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "product/list";
    }

    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable Long id) {
        // Implement cart logic here
        // Redirect to the product list after adding to the cart
        return "redirect:/";
    }

    @GetMapping("/cart")
    public String viewCart() {
        // Implement cart logic here
        return "cart/view";
    }
}
