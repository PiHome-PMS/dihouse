package com.hppm.dihouse.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    VALIDATION_ERROR(1000, "Validation failed", HttpStatus.BAD_REQUEST),
    MALFORMED_JSON(1001, "Malformed JSON request", HttpStatus.BAD_REQUEST),

    UNAUTHENTICATED(1002, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    FORBIDDEN_ACTION(1003, "You cannot do this action", HttpStatus.FORBIDDEN),

    RESOURCE_NOT_FOUND(1004, "Resource not found", HttpStatus.NOT_FOUND),
    BUSINESS_ERROR(1005, "Business rule violated", HttpStatus.BAD_REQUEST),

    UNEXPECTED_ERROR(1999, "Unexpected error", HttpStatus.INTERNAL_SERVER_ERROR),
    REQUEST_FAILED(1998, "Request failed", HttpStatus.BAD_REQUEST);

    private final int code;
    private final String defaultMessage;
    private final HttpStatus status;
}