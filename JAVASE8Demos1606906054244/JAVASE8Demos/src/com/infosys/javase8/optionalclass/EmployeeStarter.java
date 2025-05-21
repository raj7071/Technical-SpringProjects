package com.infosys.javase8.optionalclass;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStarter {
	public static void main(String[] args) {
		// Code to retrieve employees and to store them in a list called employeesList
		List<Employee> employeesList = Employee.getEmployeeList();
		List<Integer> passportNumbers = new ArrayList<>();
		// List to collect the passport numbers
		for (Employee employee : employeesList) {
			passportNumbers.add(employee.getPassport().orElse(new Passport(0)).getPassportNo());
		}
		passportNumbers.forEach(x -> System.out.println("Passport number: " + x));

	}
}
