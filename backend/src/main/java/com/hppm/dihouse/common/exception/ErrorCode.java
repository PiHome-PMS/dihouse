package com.hppm.dihouse.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    SUCCESS(1000, "Success", HttpStatus.OK),


    //custom handling error for user behavior for 4xx
    VALIDATION_ERROR(4000, "Validation failed", HttpStatus.BAD_REQUEST),
    MALFORMED_JSON(4001, "Malformed JSON request", HttpStatus.BAD_REQUEST),
    INVALID_INPUT(4002, "Invalid input", HttpStatus.BAD_REQUEST),

    UNAUTHENTICATED(4010, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    FORBIDDEN_ACTION(4030, "Forbidden", HttpStatus.FORBIDDEN),

    RESOURCE_NOT_FOUND(4040, "Not found", HttpStatus.NOT_FOUND),
    DUPLICATE_RESOURCE(4090, "Conflict", HttpStatus.CONFLICT),

    REQUEST_FAILED(4999, "Request failed", HttpStatus.BAD_REQUEST),
    UNEXPECTED_ERROR(5000, "Unexpected error", HttpStatus.INTERNAL_SERVER_ERROR);
    private final int code;
    private final String defaultMessage;
    private final HttpStatus status;
}