package com.infosys.javase8.functioninterface;

import java.util.List;
import java.util.function.Function;

public class EmployeeService {
	// main method
	public static void main(String[] args) {
		List<Employee> lstEmp = Employee.getEmpList();
		for (Employee e : lstEmp) {
			double sal = computeSalary(e, e1 -> e1.getSal() * 1.1); // 10% salary increment
			System.out.println(e.getName() + ": old salary: " + e.getSal() + ", new salary: " + sal);
		}
	}

	public static double computeSalary(Employee e, Function<Employee, Double> fn) {
		return fn.apply(e);
	}
}
