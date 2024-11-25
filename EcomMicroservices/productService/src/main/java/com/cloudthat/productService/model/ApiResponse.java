package com.cloudthat.productService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private boolean success;
    private String message;
    private Object data;
    public ApiResponse(String message, boolean success) {
        super();
        this.success = success;
        this.message = message;
    }


}