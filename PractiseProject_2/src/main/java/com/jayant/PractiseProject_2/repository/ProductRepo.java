package com.jayant.PractiseProject_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayant.PractiseProject_2.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
