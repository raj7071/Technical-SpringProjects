package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
