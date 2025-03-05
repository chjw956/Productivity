package com.example.productivity.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse<E> {
    private ResponseCode code;
    private E data;

    public static <E> ApiResponse<E> response(ResponseCode code, E data) {
        return ApiResponse.<E>builder()
                .code(code)
                .data(data)
                .build();
    }
}
