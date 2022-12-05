package com.example.group14userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum UserSuccessCodeMsg {
    LOGIN_OK(true,100,"登录成功"),
    REGISTER_OK(true,200,"注册成功"),
    RECHARGE_OK(true,300,"充值成功"),
    GET_INFO_OK(true,400,"获取成功"),
    ;
    private Boolean status;
    private int code ;
    private String msg ;
}
