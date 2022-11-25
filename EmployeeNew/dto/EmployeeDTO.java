package com.example.EmployeeNew.dto;

public class EmployeeDTO 
{
	private Long empId;
    private String name;
    private Integer age;
    private Long phoneNumbe;
    private String designation;
    private Double salary;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getPhoneNumbe() {
		return phoneNumbe;
	}
	public void setPhoneNumbe(Long phoneNumbe) {
		this.phoneNumbe = phoneNumbe;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
