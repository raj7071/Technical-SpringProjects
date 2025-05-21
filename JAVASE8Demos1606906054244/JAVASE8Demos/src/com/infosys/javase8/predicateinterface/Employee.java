package com.infosys.javase8.predicateinterface;

public class Employee {
	private Integer empId;
	private String empName;
	private String country;

	public Employee(Integer empId, String empName, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", country=" + country + "]";
	}
}
