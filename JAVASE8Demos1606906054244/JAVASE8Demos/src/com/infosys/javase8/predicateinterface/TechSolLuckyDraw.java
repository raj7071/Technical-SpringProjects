package com.infosys.javase8.predicateinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TechSolLuckyDraw {
	// main method
	public static void main(String[] args) {
		// Creating 5 instances of Employee
		Employee e1 = new Employee(1001, "Aron", "Spain");
		Employee e2 = new Employee(1050, "Cindia", "Portugal");
		Employee e3 = new Employee(1602, "Zidane", "France");
		Employee e4 = new Employee(1453, "Robert", "Belgium");
		Employee e5 = new Employee(1500, "Francis", "USA");

		// lstEmpIds is the populated list of employee ids
		List<Integer> lstEmpIds = new ArrayList<>();
		lstEmpIds.add(e1.getEmpId());
		lstEmpIds.add(e2.getEmpId());
		lstEmpIds.add(e3.getEmpId());
		lstEmpIds.add(e4.getEmpId());
		lstEmpIds.add(e5.getEmpId());

		System.out.println("Printing Even Employee Ids");
		evaluate(lstEmpIds, n -> n % 2 == 0);
		System.out.println("Printing Odd Employee Ids");
		evaluate(lstEmpIds, n -> n % 2 == 1);
		System.out.println("Printing Employee Ids less than 1500");
		evaluate(lstEmpIds, n -> n < 1500);
	}

	public static void evaluate(List<Integer> listEmpId, Predicate<Integer> predicateArg) {
		for (int empId : listEmpId) {
			if (predicateArg.test(empId))
				System.out.println(empId);
		}
	}
}
