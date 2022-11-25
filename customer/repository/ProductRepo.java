package com.database.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.database.customer.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
