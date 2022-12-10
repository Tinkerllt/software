package com.example.group14orderservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum OrderSuccessCodeMsg {
    INSERT_OK(true,100,"插入订单成功"),
    REFUND_OK(true,200,"退票成功"),
    USE_OK(true,300,"电影票使用成功"),
    GET_INFO_OK(true,400,"获取成功"),
    SEAT_OK(true,500,"座位信息")
    ;
    private Boolean status;
    private int code ;
    private String msg ;
}
