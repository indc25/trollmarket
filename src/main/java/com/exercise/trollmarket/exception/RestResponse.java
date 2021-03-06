package com.exercise.trollmarket.exception;

import lombok.Data;

@Data
public class RestResponse<T> {

    private final T data;
    private final String message;
    private final String status;
}
