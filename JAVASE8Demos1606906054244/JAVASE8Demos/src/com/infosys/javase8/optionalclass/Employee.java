package com.infosys.javase8.optionalclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee {

	private String name;
	private Integer id;
	private Double sal;

	private Optional<Passport> passport = Optional.empty(); // The container is initially empty

	public Optional<Passport> getPassport() {
		return passport;
	}

	public void setPassport(Optional<Passport> passport) {
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee(String name, Integer id, Double sal, Optional<Passport> passport) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.passport = passport;
	}

	public Employee() {
		// Default constructor
	}

	public static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		// Creating employee objects with passport
		Optional<Passport> p1 = Optional.of(new Passport(10121));
		Employee e1 = new Employee("Robert", 102, 10000D, p1);

		Optional<Passport> p2 = Optional.of(new Passport(10122));
		Employee e2 = new Employee("James", 105, 15000D, p2);

		// Creating employee objects without passport
		Employee e3 = new Employee();
		e3.setId(107);
		e3.setName("Tyrion");
		e3.setSal(21000D);

		Employee e4 = new Employee();
		e4.setId(110);
		e4.setName("Bruce");
		e4.setSal(8000D);

		// adding the objects into a list
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		return employeeList;
	}
}
