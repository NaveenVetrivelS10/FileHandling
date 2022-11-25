package com.example.EmployeeNew.service;

import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.EmployeeNew.Entity.Employee;
import com.example.EmployeeNew.Repository.EmployeeRepository;

import org.springframework.data.domain.Sort;

@Service
public class EmployeeService 
{
@Autowired
	private EmployeeRepository employeeRepository;


	public Page<Employee> employeePagination(Integer pageNumber, Integer pageSize) 
	{
		//Pageable pageable;
		PageRequest pageable = PageRequest.of(pageNumber, pageSize);
           
        return employeeRepository.findAll(pageable);
	}


	public Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize, String sortProperty) {
		Pageable pageable = null;
		pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC,sortProperty);
		 return employeeRepository.findAll(pageable);
	}
	
	


}

	

