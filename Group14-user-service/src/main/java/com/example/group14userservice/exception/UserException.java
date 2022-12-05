package com.example.group14userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserException extends RuntimeException{

    private int code = 500;
    private String msg = "服务器异常";
    public UserException(UserExceptionCodeMsg userExceptionCodeMsg){
        super();
        this.code = userExceptionCodeMsg.getCode();
        this.msg = userExceptionCodeMsg.getMsg();
    }

}