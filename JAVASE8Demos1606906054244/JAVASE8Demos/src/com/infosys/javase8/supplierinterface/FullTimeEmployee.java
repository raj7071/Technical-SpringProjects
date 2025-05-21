package com.infosys.javase8.supplierinterface;

public class FullTimeEmployee extends Employee {
	@Override
	public double generateSalarySlip() {
		System.out.println("SalarySlip of FullTime Employee");
		return super.getSal() * 1.20; // 20% increment
	}

	public FullTimeEmployee(int empId, String empname, double sal, int exp, String gender) {
		super(empId, empname, sal, exp, gender);
	}
}
