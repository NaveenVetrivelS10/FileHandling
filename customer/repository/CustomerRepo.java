package com.database.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.database.customer.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	@Query(nativeQuery=true,value="select c.name,c.email,p.price,p.product_name,p.quantity from customer c inner join product p on c.id=p.product_id")
	List<Object> getcustomerproduct();

	
	@Query(nativeQuery=true,value="select c.name,p.product_name from customer c inner join product p on c.id=p.product_id")
	List<Object> getcustomerproductNames();

	@Query(nativeQuery=true,value="select name,number from customer  ")
	List<Object> customernameandnumber();

	@Query(nativeQuery=true,value="SELECT product_name,price FROM product  ORDER BY price  asc")
	List<Object> getproductpriceasc();
	
	
	
	



}
