package com.infosys.javase8.lambdaexpression;

public class Employee {
	Integer empId;
	String empName;
	String country;

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public Employee(Integer empId, String empName, String country) {
		this.empId = empId;
		this.empName = empName;
		this.country = country;
	}

	public String toString() {
		return "empId : " + empId + ", empName : " + empName + ", country : " + country;
	}
}
