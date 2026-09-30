package com.jayant.TestProject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayant.TestProject.model.Product;
import com.jayant.TestProject.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getProduct() {
        return service.getProducts();
    }

    @GetMapping("/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    @PostMapping
    public String addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
        return "Item added successfully";
    }

    @PutMapping
    public String updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
        return "Product updated successfully";
    }

    @DeleteMapping("/{prodId}")
    public String deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
        return "Product deleted";
    }
}
