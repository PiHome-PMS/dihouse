package com.hppm.dihouse.common.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    VALIDATION_ERROR(1000, "Validation failed", HttpStatus.BAD_REQUEST),
    MALFORMED_JSON(1001, "Malformed JSON request", HttpStatus.BAD_REQUEST),
    FORBIDDEN_ACTION(1403, "You cannot do this action", HttpStatus.FORBIDDEN),
    UNEXPECTED_ERROR(1500, "Unexpected error", HttpStatus.INTERNAL_SERVER_ERROR);

    private final int code;
    private final String message;
    private final HttpStatus status;

    ErrorCode(int code, String message, HttpStatus status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public int getCode() { return code; }
    public String getMessage() { return message; }
    public HttpStatus getStatus() { return status; }
}