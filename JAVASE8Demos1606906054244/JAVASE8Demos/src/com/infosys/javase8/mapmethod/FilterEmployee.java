package com.infosys.javase8.mapmethod;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee {
	public static void main(String[] args) {
		List<Employee> listEmp = Employee.getEmpList();
		// displaying the sample data
		System.out.println("*****Sample Data*****");
		listEmp.forEach(employee -> System.out.println(employee.getId() + ":" + employee.getName() + ":" + employee.getSal()));
		// displaying the data after applying filter and increasing salary
		System.out.println("*****Data after applying filter and increasing salary*****");
		List<Employee> listNewEmp = listEmp.stream().filter(employee -> employee.getYearsInOrg() < 1).map(employee -> {
			employee.setSal(employee.getSal() + 5000);
			return employee;
		}).collect(Collectors.toList());
		listNewEmp.forEach(employee -> System.out.println(employee.getId() + ":" + employee.getName() + ":" + employee.getSal()));
	}
}
