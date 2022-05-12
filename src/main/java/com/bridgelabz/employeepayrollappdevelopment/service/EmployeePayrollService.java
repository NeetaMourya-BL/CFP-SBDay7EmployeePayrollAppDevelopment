package com.bridgelabz.employeepayrollappdevelopment.service;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.employeepayrollappdevelopment.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappdevelopment.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int employeeId) {
        return employeePayrollList.stream().filter(empData -> empData.getEmployeeId() == employeeId).findFirst()
                .orElseThrow(() -> new EmployeePayrollException("Employee Not found with the id:" +employeeId));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(employeePayrollList.size() + 1, empPayrollDTO);
        employeePayrollList.add(empData);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(employeeId);
        empData.setName(empPayrollDTO.name);
        empData.setSalary(empPayrollDTO.salary);
        employeePayrollList.set(employeeId - 1, empData);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int employeeId) {
        employeePayrollList.remove(employeeId - 1);
    }

}
