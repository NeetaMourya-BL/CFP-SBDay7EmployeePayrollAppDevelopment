package com.bridgelabz.employeepayrollappdevelopment.repository;

import java.util.List;
import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Long> {
    @Query(value = "select * from employeepayroll_db,employee_department where employee_id=id and department= :departments", nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByDepartment(String department);

    @Query(value = "select * from employeepayroll_db where gender= :gender", nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByGender(String gender);

}