package com.study.docker.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResponseType {

    SUCCESS(200, HttpStatus.OK,"Success"),
    ERROR_MULTIPART_FILE_SIZE(400, HttpStatus.NOT_ACCEPTABLE,"Fail")
    ;

    private final int code;

    private final HttpStatus httpStatus;

    private final String message;

    ResponseType(int code, HttpStatus httpStatus, String message) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.message = message;
    }

}
