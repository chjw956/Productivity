package com.example.productivity.error.response;

import com.example.productivity.error.code.ErrorCode;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiErrorResponse {
    private int code;
    private String message;

    public static ApiErrorResponse of(ErrorCode errorCode, String message){
        return ApiErrorResponse.builder()
                .code(errorCode.getCode())
                .message(message)
                .build();
    }

    public static ApiErrorResponse of(ErrorCode errorCode){
        return ApiErrorResponse.builder()
                .code(errorCode.getCode())
                .message(errorCode.getMessage())
                .build();
    }
}
