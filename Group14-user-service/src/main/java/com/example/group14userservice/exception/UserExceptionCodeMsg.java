package com.example.group14userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum UserExceptionCodeMsg {
    USERNAME_NOT_EXISTS(false,101,"用户名不存在"),
    USERNAME_ALREADY_EXIST(false,102,"用户名已存在"),
    LOGIN_FAIL(false,103,"用户名或密码错误");
    private Boolean status;
    private int code ;
    private String msg ;

}

