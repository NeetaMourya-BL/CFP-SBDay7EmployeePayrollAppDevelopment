package com.bridgelabz.employeepayrollappdevelopment.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

    @Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Employee name Invalid it shpuld be start with capital letter")
    @NotEmpty(message = "Employee Name can't be null")
    public String name;

    @Min(value = 1000, message = "Min Wage should be more than 1000")
    public long salary;
    public EmployeePayrollDTO(String name, long salary) {
        super();
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
    }
}
