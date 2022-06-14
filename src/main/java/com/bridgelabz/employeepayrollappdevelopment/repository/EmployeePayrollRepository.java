package com.bridgelabz.employeepayrollappdevelopment.repository;

import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Long> {
    @Query(value = "select * from employeepayroll_db,employee_department where employee_id=id and departments= :departments", nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByDepartment(String departments);

    @Query(value = "select * from employeepayroll_db where gender= :gender", nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByGender(String gender);

}