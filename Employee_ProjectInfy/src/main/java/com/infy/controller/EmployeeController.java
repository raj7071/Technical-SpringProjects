package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Employee;
import com.infy.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping()
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.createEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> fetchEmployeeById(@PathVariable("id") long empId,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.fetchEmployeeById(empId),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable("id") long empId){
      return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, empId),HttpStatus.OK);		
	}
	 
	 @DeleteMapping("{id}")
	 public ResponseEntity<String> deleteEmployee(@PathVariable("id") long empId) {
		 employeeService.deleteEmployee(empId);
		 return new ResponseEntity<String> ("Employee deleted successfully ",HttpStatus.OK);
	 }
		
}
