package com.infosys.javase8.parallelstreams;

import java.util.List;

public class FilterEmployee {
	public static void main(String[] args) {
		List<Employee> lstEmp = Employee.getEmployeeList();
		lstEmp.parallelStream().filter(employee -> employee.getYearsInOrg() < 1).sorted((e1, e2) -> e1.getId() - e2.getId())
				.forEach(employee -> System.out.println(employee.getId() + ":" + employee.getName()));
	}
}
