package com.Jayant.PracticeProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Jayant.PracticeProject.model.Product;
import com.Jayant.PracticeProject.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired 
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProduct() {
		return service.getProduct();		
		
	}
	
	@GetMapping("/productId/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	 
	@PostMapping("/product")
	public String addProduct(@RequestBody Product product) {
		    service.addProducts(product);
		    return "Items added successfully";
	}
	
	@PutMapping("/update/{id}")
	public String updateProduct(@PathVariable int id,  @RequestBody Product product) {
		service.updateProduct(id, product);
		return "Item details Updated Successfully";
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deletePoductById(@PathVariable int id) {
		service.deleteProductById(id);
		return "Item deleted successfully";
	}
	
	@DeleteMapping("/deleteAll")
	public String deletePoduct() {
		service.deleteProduct();
		return "All items deleted successfully";
	}
	
	
	
	
	
	
	
	

}
