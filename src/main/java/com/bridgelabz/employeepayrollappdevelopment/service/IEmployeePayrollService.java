package com.bridgelabz.employeepayrollappdevelopment.service;

import com.bridgelabz.employeepayrollappdevelopment.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(String token);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(String token,EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(String token);
    List<EmployeePayrollData> getEmployeesPayrollDataByDepartment(String departments);
    List<EmployeePayrollData> getEmployeesPayrollDataByGender(String gender);

    String deleteallEmployeePayrollData();
}