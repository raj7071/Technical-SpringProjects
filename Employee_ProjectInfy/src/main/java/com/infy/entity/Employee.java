package com.infy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

	@Id
	private long empId;
	
	private String empFirstName;
	
	private String empLastName;
	
	private String empEmail;
	
	private String empDepartment;
	
	private long empPhoneNo;
	
	

	public long getEmpPhoneNo() {
		return empPhoneNo;
	}

	public void setEmpPhoneNo(long empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmail=" + empEmail + ", empDepartment=" + empDepartment + ", empPhoneNo=" + empPhoneNo + "]";
	}
	
	
	
}
