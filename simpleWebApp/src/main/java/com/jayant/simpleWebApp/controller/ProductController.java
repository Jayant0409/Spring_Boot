package com.jayant.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayant.simpleWebApp.service.ProductService;
import com.jayant.simpleWebApp.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {
	
	@Autowired 
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProduct() {
		return service.getProducts();
		
	}
	
	@GetMapping("/product/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductById(prodId);
		
	}

	
//	public String postMethodName(@RequestBody String entity) {
//		//TODO: process POST request
//		
//		return entity;
//	}
	  @PostMapping("/products")
	  public String addProduct(@RequestBody Product prod) {
		  service.addProduct(prod);
		  return "Items added successfully";
	  }
	  
	  @PutMapping("/product")
	  public String updateProduct(@RequestBody Product prod) {
		  service.updateProduct(prod);
		  return "Product updated successfully";
	  }
	  
	  @DeleteMapping("/product/{prodId}")
	  public String deleteProduct(@PathVariable int prodId) {
		  service.deleteProduct(prodId);
		  return "Product deleted";
		
	}
	  
	  
	  
	  
	  
}
