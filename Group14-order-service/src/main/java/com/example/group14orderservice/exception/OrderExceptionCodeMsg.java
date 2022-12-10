package com.example.group14orderservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum OrderExceptionCodeMsg {
    INSUFFICIENT_FUNDS(false,101,"余额不足"),
    REFUND_FAIL(false,201,"退款失败"),
    USE_FAIL(false,301,"使用失败"),
    SEAT_ALREADY_SOLD(false,401,"该位置已被购买"),
    ;
    private Boolean status;
    private int code ;
    private String msg ;

}

