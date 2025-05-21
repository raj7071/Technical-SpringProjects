package com.infosys.javase8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class PredefinedMethod {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Aron", "Spain");
		Employee e2 = new Employee(102, "Cindia", "Portugal");
		Employee e3 = new Employee(103, "Zidane", "France");
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		System.out.println("Before sorting : " + empList);
		empList.sort(Employee::compareByCountry);
		System.out.println("After sorting : " + empList);
	}
}
