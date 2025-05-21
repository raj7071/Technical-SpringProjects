package com.infosys.javase8.typesofoperations;

import java.util.ArrayList;
import java.util.List;

public class OperationsService {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Aron", "France");
		Employee e2 = new Employee(102, "Cindia", "Uzbekistan");
		Employee e3 = new Employee(103, "Zidane", "Singapore");
		Employee e4 = new Employee(104, "Emilia", "Mongolia");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		// Intermediate operation
		employeeList.sort((a, b) -> a.getCountry().compareTo(b.getCountry()));

		// Terminal Operation
		employeeList.forEach(emp -> System.out.println(emp.getCountry()));

	}
}
