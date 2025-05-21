package com.infy.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infy.entity.Employee;
import com.infy.exception.EmpResourceNotFoundException;
import com.infy.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		
	}
	

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee fetchEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(() -> 
						new EmpResourceNotFoundException("Employee", "empId", id));
		
	}
	
	@Override
	public Employee updateEmployee(Employee employee,long id) {
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				() -> new EmpResourceNotFoundException("Employee", "Id", id)); 
		existingEmployee.setEmpFirstName(employee.getEmpFirstName());
		existingEmployee.setEmpLastName(employee.getEmpLastName());
		existingEmployee.setEmpEmail(employee.getEmpEmail());
		existingEmployee.setEmpDepartment(employee.getEmpDepartment());
		existingEmployee.setEmpPhoneNo(employee.getEmpPhoneNo());
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}
	
	public void deleteEmployee(long id) {
		employeeRepository.findById(id).orElseThrow(() -> 
		new EmpResourceNotFoundException("Employee", "Id", id));
employeeRepository.deleteById(id);
	}
	
}
