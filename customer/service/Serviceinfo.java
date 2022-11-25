package com.database.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.customer.entity.Customer;
import com.database.customer.repository.CustomerRepo;
import DataTransferObject.CustomerDTO;


@Service
public class Serviceinfo {
	@Autowired
	private CustomerRepo customerRepo;
	
	
	public List<Customer> showAllinfomation() {
		
		return customerRepo.findAll();
	}

	public Customer saveorders (CustomerDTO customerDTO) 
	{
		Customer customer =new Customer ();
		customer.setName(customerDTO.getName());
		customer.setNumber(customerDTO.getNumber());
		customer.setEmail(customerDTO.getEmail());
		customer.setProduct(customerDTO.getProduct());
		
		return customerRepo.save(customer);
		
	}

	public List<Object> getcustomerproduct() {
		
		return customerRepo.getcustomerproduct();
	}

	public List<Object> getcustomerproductNames() {
		
		return customerRepo.getcustomerproductNames();
	}

	public List<Object> customernameandnumber() {
		
		return customerRepo.customernameandnumber();
	}

	public List<Object> getproductpriceasc() {
		
		return customerRepo.getproductpriceasc();
	}



	

	}
