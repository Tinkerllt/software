package com.example.group14orderservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderException extends RuntimeException{

    private int code = 500;
    private String msg = "服务器异常";
    public OrderException(OrderExceptionCodeMsg orderExceptionCodeMsg){
        super();
        this.code = orderExceptionCodeMsg.getCode();
        this.msg = orderExceptionCodeMsg.getMsg();
    }

}