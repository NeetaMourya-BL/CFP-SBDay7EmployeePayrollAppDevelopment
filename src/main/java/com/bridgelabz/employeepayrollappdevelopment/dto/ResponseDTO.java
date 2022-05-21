package com.bridgelabz.employeepayrollappdevelopment.dto;

import lombok.Data;

public @Data class ResponseDTO {

    private String message;
    private Object data;

    public ResponseDTO(String string, Object payrollData) {
        this.message = string;
        this.data = payrollData;
    }


}