package com.jayant.PractiseProject_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jayant.PractiseProject_2.model.Product;
import com.jayant.PractiseProject_2.repository.ProductRepo;

@Component
public class ProductService {
	
	@Autowired
     ProductRepo repo;
	
	public List<Product> getProducts(){
	     return repo.findAll();	
	}
	
	
	public Product getProductById(int id){
		return repo.findById(id).orElse(null);	
	}
	
	
	public Product addProducts(Product product) {
		return repo.save(product);
	}
	
	
	public Product updateProduct(int id , Product product) {
		
		Product existingProduct = repo.findById(id).orElse(null);
		
		if(existingProduct != null) {
			existingProduct.setProdName(product.getProdName());
			existingProduct.setProdPrice(product.getProdPrice());
		}
		return repo.save(existingProduct);
	}
	
	
	public void deleteById(int id) {

		 repo.deleteById(id);
	
	}
	
	public void deleteAll() {
		repo.deleteAll();
	}

}
