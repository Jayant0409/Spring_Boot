package com.Jayant.PracticeProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Jayant.PracticeProject.model.Product;
import com.Jayant.PracticeProject.repository.ProductRepo;

@Component
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public List<Product> getProduct() {
		return repo.findAll();
		
	}
	
	
	public Product getProductById(int prodId) {
		return repo.findById(prodId).orElse(null);
	}
	
	public Product addProducts(Product product) {
		return repo.save(product);
		
	}
	
	public Product updateProduct(Integer id, Product product) {
		
		Product existingProduct = repo.findById(id).orElse(null);
		
		if(existingProduct != null) {
			existingProduct.setProdName(product.getProdName());
			existingProduct.setProdPrice(product.getProdPrice());
		}
		
		
		return repo.save(existingProduct);
	}
	
	public void deleteProductById(int prodId) {
		repo.deleteById(prodId);
	}
	
	public void deleteProduct() {
		repo.deleteAll();
	}
	

}
