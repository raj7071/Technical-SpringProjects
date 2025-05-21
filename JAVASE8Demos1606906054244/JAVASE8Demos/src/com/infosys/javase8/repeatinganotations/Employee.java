package com.infosys.javase8.repeatinganotations;

public abstract class Employee implements Remunerator {
	public abstract double calculateSalary();

	private int empId;
	private String empname;
	private double sal;
	int exp;
	String gender;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(int empId, String empname, double sal, int exp, String gender) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.sal = sal;
		this.exp = exp;
		this.gender = gender;
	}
}
