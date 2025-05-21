package com.infosys.javase8.consumerinterface;

import java.util.List;
import java.util.function.Consumer;

public class EmployeeService {
	public static void main(String[] args) {
		List<Employee> listEmp = Employee.getEmpList();

		System.out.println("***** Generating HR Report *****");
		generateReport(listEmp,
				e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole() + " : " + e.getSal()));

		System.out.println("\n***** Generating Manager Report *****");
		generateReport(listEmp, e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole()));
	}

	public static void generateReport(List<Employee> listEmp, Consumer<Employee> consumer) {
		for (Employee e : listEmp) {
			consumer.accept(e);
		}
	}
}