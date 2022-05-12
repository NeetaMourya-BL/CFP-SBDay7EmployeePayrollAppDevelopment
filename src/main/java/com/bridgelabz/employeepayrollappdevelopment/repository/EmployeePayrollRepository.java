package com.bridgelabz.employeepayrollappdevelopment.repository;

import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}