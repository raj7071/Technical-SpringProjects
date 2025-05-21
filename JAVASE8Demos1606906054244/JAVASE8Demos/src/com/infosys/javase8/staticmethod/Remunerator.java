package com.infosys.javase8.staticmethod;

public interface Remunerator {
	public abstract double deductFoodFee();

	final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
	final double PENSION_PERCENTAGE = 5.0;

	public default double deductHealthInsurancePremium(double employeeSalary) {
		return (employeeSalary * HEALTH_INSURANCE_PERCENTAGE / 100);
	}

	public static double deductForPension(double employeeSalary) { // Static method of the interface
		return (employeeSalary * PENSION_PERCENTAGE / 100);
	}
}
