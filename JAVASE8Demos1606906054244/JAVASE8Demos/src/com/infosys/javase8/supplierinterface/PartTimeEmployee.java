package com.infosys.javase8.supplierinterface;

public class PartTimeEmployee extends Employee {
	@Override
	public double generateSalarySlip() {
		System.out.println("SalarySlip of PartTime Employee");
		return super.getSal() * 1.10; // 10% increment
	}

	public PartTimeEmployee(int empId, String empname, double sal, int exp, String gender) {
		super(empId, empname, sal, exp, gender);
	}
}
