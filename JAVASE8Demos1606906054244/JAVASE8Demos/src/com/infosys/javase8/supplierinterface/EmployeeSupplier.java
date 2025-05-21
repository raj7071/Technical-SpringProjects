package com.infosys.javase8.supplierinterface;

import java.util.List;
import java.util.function.Supplier;

public class EmployeeSupplier {
	public static void main(String[] args) {
		
		List<? extends Employee> listEmp = Employee.getEmployees();
        for (Employee e : listEmp) {
            generate(() -> e);
        }
    }

    public static void generate(Supplier<? extends Employee> supplier) {
        System.out.println(supplier.get().generateSalarySlip());
    }
} 
