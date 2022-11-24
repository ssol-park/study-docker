package com.study.docker.exception;

import com.study.docker.common.ResponseDto;
import com.study.docker.common.ResponseType;
import org.springframework.http.HttpStatus;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MaxUploadSizeExceededException.class)
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDto handleConflict() {
        return new ResponseDto(ResponseType.ERROR_MULTIPART_FILE_SIZE);
    }

}
