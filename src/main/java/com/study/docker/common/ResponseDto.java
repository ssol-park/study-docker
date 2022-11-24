package com.study.docker.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {

    private String message;

    private int code;

    private boolean isSuccess;

    public ResponseDto() {
        this.message = ResponseType.SUCCESS.getMessage();
        this.code = ResponseType.SUCCESS.getCode();
        this.isSuccess = true;
    }

    public ResponseDto(ResponseType responseType) {
        this.message = responseType.getMessage();
        this.code = responseType.getCode();
        this.isSuccess = responseType.getCode() == 200 ? true : false;
    }
}
