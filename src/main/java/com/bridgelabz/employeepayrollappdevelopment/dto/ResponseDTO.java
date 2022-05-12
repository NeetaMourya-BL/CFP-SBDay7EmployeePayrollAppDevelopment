package com.bridgelabz.employeepayrollappdevelopment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import lombok.Data;

public @Data class ResponseDTO {

    private String message;
    private Object data;

    public ResponseDTO(String message,Object data) {
        this.message = message;
        this.data = data;
    }
}