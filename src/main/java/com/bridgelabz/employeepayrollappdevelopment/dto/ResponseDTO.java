package com.bridgelabz.employeepayrollappdevelopment.dto;

import com.bridgelabz.employeepayrollappdevelopment.model.EmployeePayrollData;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public @Data class ResponseDTO {

    private String message;
    private Object data;

    public ResponseDTO(String string, EmployeePayrollData payrollData) {
        this.message = string;
        this.data = payrollData;
    }
    public ResponseDTO(String message, String string) {}



    public ResponseDTO(String string, Optional<EmployeePayrollData> employeeList) {
        // TODO Auto-generated constructor stub
    }
    public ResponseDTO(String string, List<String> errMesg) {
        // TODO Auto-generated constructor stub
    }


}