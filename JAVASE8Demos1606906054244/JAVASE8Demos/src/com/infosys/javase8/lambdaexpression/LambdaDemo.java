package com.infosys.javase8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
	public static void main(String[] args) {
		// Example 1: To access a method with no arguments
		System.out.println("Example 1: No argument lambda expression ");
		DemoInterface1 demoInterface1 = () -> System.out.println("No arguments");
		demoInterface1.noArguments();
		System.out.println(); // for line spacing

		// Example 2: To access a method with 2 arguments
		System.out.println("Example 2: Multiple arguments lambda expression ");
		DemoInterface2 demoInterface2 = (String s, Integer i) -> System.out
				.println("String value: " + s + ", Integer value: " + i);
		demoInterface2.twoArguments("Christiano Ronaldo", 7);
		System.out.println(); // for line spacing

		// Example 3: To access a method with 1 argument
		System.out.println("Example 3: One argument lambda expression to print square of the given Integer number");
		DemoInterface3 demoInterface3 = k -> k * k;
		System.out.println(demoInterface3.singleArgument(7));
		System.out.println(); // for line spacing

		// Example 4: To sort a list empList by implementing Comparator interface
		System.out.println("Example 4: To use lambda expression for sorting using Comparator interface");
		Employee e1 = new Employee(101, "Robert", "Canada");
		Employee e2 = new Employee(102, "Ibrahim", "Azerbaijan");
		Employee e3 = new Employee(103, "Wang", "Japan");
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		System.out.println("Before sort: " + empList);
		empList.sort((employee1, employee2) -> employee1.getCountry().compareTo(employee2.getCountry()));
		System.out.println("After sort: " + empList);
	}
}
