package com.infosys.javase8.repeatinganotations;

@Author(name = "John", method = "calculateSalary()")
@Author(name = "James", method = "deductFoodFee()")
@Author(name = "Mark", method = "deductHealthInsurancePremium()")
public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(int empId, String empname, double sal, int exp, String gender) {
		super(empId, empname, sal, exp, gender);
	}

	// field declarations
	public double calculateSalary() {
		// Salary calculation for full-time employee
		return super.getSal();
	}

	public double deductFoodFee() {
		// Food fee deduction from salary
		return super.getSal() - super.getSal() * 0.1;
	}

	public double deductHealthInsurancePremium() {
		return (HEALTH_INSURANCE_PERCENTAGE * super.getSal()) / 100;
	}
}
