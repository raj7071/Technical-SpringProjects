package com.infy.service;

import java.util.List;

import com.infy.entity.Employee;

public interface EmployeeService {

	 Employee createEmployee(Employee employee);
	 List<Employee> getAllEmployees();
	 Employee fetchEmployeeById(long empId);
	 Employee updateEmployee(Employee employee,long empId);
	 void deleteEmployee(long empId);
	
	
	
}
