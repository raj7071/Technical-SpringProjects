package com.infosys.javase8.functioninterface;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer empId;
	private String name;
	private Double sal;

	public Employee(Integer empId, String name, Double sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Employee> getEmpList() {
		Employee e1 = new Employee(101, "Aron", 50000D);
		Employee e2 = new Employee(102, "Cindia", 30000D);
		Employee e3 = new Employee(103, "Zidane", 45000D);
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		return empList;
	}
}
