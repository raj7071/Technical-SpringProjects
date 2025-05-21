package com.infosys.javase8.streams;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeService {
	// In the below example different streams are used for sorting and filtering
	// because streams cannot be reused
	public static void main(String[] args) {
		List<Employee> lstEmp = Employee.getEmployeeList();
		// Converting a List into Stream
		Stream<Employee> empStream = lstEmp.stream();
		// Printing the stream
		System.out.println("*****Printing the stream*****");
		empStream.forEach(System.out::println);
		Stream<Employee> empStreamfilter = lstEmp.stream();
		// Filtering based on Employee's time in the organization
		System.out.println("*****Filtering the stream*****");
		Stream<Employee> filterEmpStream = empStreamfilter.filter(emp -> emp.getYearsInOrg() < 1);
		filterEmpStream.forEach(System.out::println);
		Stream<Employee> empStreamsort = lstEmp.stream();
		System.out.println("*****Sorting the stream*****");
		// Sorting based on Employee ID
		Stream<Employee> sortedEmpStream = empStreamsort.sorted((e1, e2) -> e1.getId() - e2.getId());
		sortedEmpStream.forEach(System.out::println);
		Stream<Employee> empStreampipeline = lstEmp.stream();
		// Pipelining all the streams into one
		System.out.println("*****Piplelining all the functionalities*****");
		empStreampipeline.filter(emp -> emp.getYearsInOrg() < 1).sorted((e1, e2) -> e1.getId() - e2.getId())
				.forEach(e -> System.out.println(e.getId() + ":" + e.getName()));
	}
}
