package com.bridgelabz.employeepayrollappdevelopment.service;

import com.bridgelabz.employeepayrollappdevelopment.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappdevelopment.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollappdevelopment.repository.EmployeePayrollRepository;
import com.bridgelabz.employeepayrollappdevelopment.util.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

    @Autowired
    TokenUtil tokenUtil;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollRepository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(String token) {

        return employeePayrollRepository.findById(tokenUtil.decodeToken(token))
                .orElseThrow(() -> new EmployeePayrollException("Employee With employeeId: " + tokenUtil.decodeToken(token) + " does not exists"));
    }
    @Override
    public EmployeePayrollData createEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(empPayrollDTO);
        return employeePayrollRepository.save(empData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(@RequestHeader String token, @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(token);
        empData.updateEmployeePayollData(empPayrollDTO);
        return employeePayrollRepository.save(empData);
    }

    @Override
    public void deleteEmployeePayrollData(String token) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(token);
        employeePayrollRepository.delete(empData);
    }

    @Override
    public List<EmployeePayrollData> getEmployeesPayrollDataByDepartment(String departments) {
        return employeePayrollRepository.findEmployeesByDepartment(departments);
    }

    @Override
    public List<EmployeePayrollData> getEmployeesPayrollDataByGender(String gender) {
        return employeePayrollRepository.findEmployeesByGender(gender);
    }

    @Override
    public String deleteallEmployeePayrollData() {
        employeePayrollRepository.deleteAll();
        return "All Data Delete";
    }

}