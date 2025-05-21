package com.infosys.javase8.traversingcollectionsusinglambda;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Aron", "France");
		Employee e2 = new Employee(102, "Cindia", "Uzbekistan");
		Employee e3 = new Employee(103, "Zidane", "Singapore");
		Employee e4 = new Employee(104, "Emilia", "Mongolia");
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		/*
		 * Traditional for-each loop code Uncomment the below code to see the difference
		 * between Traditional approach and Lambda
		 */
		/*
		 * for (Employee emp : empList) { System.out.println(emp.getCountry()); }
		 */

		empList.forEach(emp -> System.out.println(emp.getCountry()));

	}
}
