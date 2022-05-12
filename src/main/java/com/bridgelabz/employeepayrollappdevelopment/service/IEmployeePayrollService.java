package com.bridgelabz.employeepayrollappdevelopment.service;

import java.util.List;
import com.bridgelabz.employeepayrollappdevelopment.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int employeeId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int employeeId,EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int employeeId);
    List<EmployeePayrollData> getEmployeesPayrollDataByDepartment(String department);

}