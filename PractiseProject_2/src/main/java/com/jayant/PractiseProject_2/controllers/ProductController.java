package com.jayant.PractiseProject_2.controllers;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayant.PractiseProject_2.model.Product;
import com.jayant.PractiseProject_2.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<?> getProducts(){
		
		List<Product> prod = service.getProducts();
		
		if(prod != null) {
			return ResponseEntity.ok(prod);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(Map.of("message", "Products not Found"));
	}
}
	
	@GetMapping("/productById/{id}")
	public ResponseEntity<?> getProductById(@PathVariable int id){
		
		Product product = service.getProductById(id);
		
		if(product != null) {
			return ResponseEntity.ok(product);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(Map.of("message", "Product not Found"));
		}
		
	}
	
	@PostMapping("/products")
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		
		Product prod = service.addProducts(product);
		if(prod != null) {
			return ResponseEntity.ok(prod);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body(Map.of("message", "Failed to add"));
		}
		
		
	}
	
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<?> updatProduct(@PathVariable int id,  @RequestBody Product product) {
		
		Product prod = service.updateProduct(id, product);
		if(prod != null) {
			return ResponseEntity.ok(prod);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body(Map.of("message", "Failed to upload"));
		}
		
	}
	
	public ResponseEntity<?> deleteProductByid(@PathVariable int id){
		
		Product p = service.getProductById(id);
		
		if(p!= null) {
			service.deleteById(id);
			return ResponseEntity.ok(p);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(Map.of("message", "Product not Found"));
		}
	}
	
public ResponseEntity<?> deleteAll(){
		
		List<Product> p = service.getProducts();
		
		if(p!= null) {
			service.deleteAll();
			return ResponseEntity.ok(p);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(Map.of("message", "Products are not Present"));
		}
	}
	
	

}
