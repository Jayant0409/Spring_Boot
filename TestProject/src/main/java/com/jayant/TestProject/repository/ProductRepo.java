package com.jayant.TestProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayant.TestProject.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {	
}
