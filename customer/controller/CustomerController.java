package com.database.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.customer.entity.Customer;
import com.database.customer.service.Serviceinfo;


import DataTransferObject.CustomerDTO;

@RestController
@RequestMapping("/new")
public class CustomerController {

	@Autowired
	private Serviceinfo serviceinfo;

		
	@PostMapping(path = "/save")
	public  Customer  saveorders (@RequestBody CustomerDTO customerDTO) 
	{
		 return serviceinfo.saveorders(customerDTO);
	}
	@GetMapping(path = "/get")
	
	public List<Customer> showAllinfomation()
	{
		return serviceinfo.showAllinfomation();
	}
	
    @GetMapping(path = "/getcustomerproduct")
	public List<Object> getcustomerproduct()
	{
		return serviceinfo.getcustomerproduct();
	}
	
    @GetMapping(path = "/getcustomerproductnames")
  	public List<Object>customerproductNames()
  	{
  		return serviceinfo.getcustomerproductNames();
  	}
  	
    @GetMapping(path = "/getcustomernameandnumber")
  	public List<Object>customernameandnumber()
  	{
  		return serviceinfo.customernameandnumber();
  	}
    
    @GetMapping(path = "/getproductpriceasc")
  	public List<Object>getproductpriceascr()
  	{
  		return serviceinfo.getproductpriceasc();
  	}
    
    
}
	
	
