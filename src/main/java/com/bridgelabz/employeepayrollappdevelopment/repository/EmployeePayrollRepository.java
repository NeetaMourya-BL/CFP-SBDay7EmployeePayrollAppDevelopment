package com.bridgelabz.employeepayrollappdevelopment.repository;

import java.util.List;
import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {
    @Query(value = "select * from employeepayroll_db,employee_department where employee_id=id and department= :department", nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByDepartment(String department);

}