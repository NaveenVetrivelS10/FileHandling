package com.example.EmployeeNew.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeNew.Entity.Employee;
import com.example.EmployeeNew.Repository.EmployeeRepository;
import com.example.EmployeeNew.dto.EmployeeDTO;
import com.example.EmployeeNew.service.EmployeeService;


@RequestMapping(value = "/new")
@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(path = "/saveemployee")
	public void createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		Employee employee = new Employee();

		BeanUtils.copyProperties(employeeDTO, employee);
		employeeRepository.save(employee);
	}
	@GetMapping(path = "/getEmployeelist")
	public List<Employee> getEmployeeList() {

	List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();

	return employeeList;
     }
	
	@GetMapping(path = "/paging/{pageNumber}/{pageSize}")
	    public Page<Employee> employeePagination(@PathVariable Integer pageNumber, @PathVariable Integer pageSize)
	 {
	        return employeeService.employeePagination(pageNumber,pageSize);
	 }
	 
	@GetMapping(path = "/pagingAndShorting/{pageNumber}/{pageSize}/{sortProperty}")
	          public Page<Employee> employeePagination(@PathVariable Integer pageNumber,
	                                             @PathVariable Integer pageSize,
	                                             @PathVariable String sortProperty) {
	        return employeeService.getEmployeePagination(pageNumber, pageSize, sortProperty);
	    }
	 
	 }
