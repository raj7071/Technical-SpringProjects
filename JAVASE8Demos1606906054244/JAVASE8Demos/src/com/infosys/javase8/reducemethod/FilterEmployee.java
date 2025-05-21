package com.infosys.javase8.reducemethod;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterEmployee {
	public static void main(String[] args) {
		List<Employee> listEmp = Employee.getEmpList();

		List<Employee> listNewEmp = listEmp.stream().filter(emp -> emp.getYearsInOrg() < 1).map(emp -> {
			emp.setSal(emp.getSal() + 5000);
			return emp;
		}) // Incrementing salary
				.collect(Collectors.toList());

		System.out.println("Employees less than a year old with increment:");
		listNewEmp.forEach(emp -> System.out.println(emp.getId() + ":" + emp.getName() + ":" + emp.getSal()));

		Optional<Integer> max = listNewEmp.stream().map(emp -> emp.getSal()).reduce(Integer::max); // Finding the maximum
																								// salary
		List<Employee> listMaxEmp = listNewEmp.stream().filter(emp -> emp.getSal().equals(max.get())) // Finding employees
																									// with the maximum
																									// salary
				.collect(Collectors.toList());

		System.out.println("\nEmployees having maximum salary after increment:");
		listMaxEmp.forEach(emp -> System.out.println(emp.getId() + ":" + emp.getName() + ":" + emp.getSal()));
	}
}
