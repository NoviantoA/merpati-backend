package com.novianto.merpatibackend.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ApiError {

    private String message;
    private HttpStatus status;
    private Map<String, ErrorInfo> fields = new HashMap<>();

    public ApiError(String message, HttpStatus status, Map<String, ErrorInfo> fieldsWithErrors) {
        this.message = message;
        this.status = status;
        this.fields = fieldsWithErrors == null ? Collections.emptyMap() : fieldsWithErrors;
    }

    public ApiError(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}
