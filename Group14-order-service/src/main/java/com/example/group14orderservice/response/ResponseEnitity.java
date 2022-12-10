package com.example.group14orderservice.response;

import com.example.group14orderservice.exception.OrderExceptionCodeMsg;
import com.example.group14orderservice.exception.OrderSuccessCodeMsg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseEnitity<T> {


    private boolean status;
    //服务端返回的错误码
    private int code = 200;
    //服务端返回的错误信息
    private String msg = "success";
    //我们服务端返回的数据
    private T data;



    public static <T> ResponseEnitity success(OrderSuccessCodeMsg userSuccessCodeMsg, T data){
        ResponseEnitity responseEnitity = new ResponseEnitity(userSuccessCodeMsg.getStatus(), userSuccessCodeMsg.getCode(), userSuccessCodeMsg.getMsg(), data);
        return responseEnitity;
    }

    public static <T> ResponseEnitity success(OrderSuccessCodeMsg userSuccessCodeMsg,String msg, T data){
        ResponseEnitity responseEnitity = new ResponseEnitity(userSuccessCodeMsg.getStatus(), userSuccessCodeMsg.getCode(), msg, data);
        return responseEnitity;
    }

    public static <T> ResponseEnitity error(OrderExceptionCodeMsg appExceptionCodeMsg){
        ResponseEnitity responseEnitity = new ResponseEnitity(appExceptionCodeMsg.getStatus(), appExceptionCodeMsg.getCode(), appExceptionCodeMsg.getMsg(), null);
        return responseEnitity;
    }
    public static <T> ResponseEnitity error(int code, String msg){
        ResponseEnitity responseEnitity = new ResponseEnitity(false,code,msg, null);
        return responseEnitity;
    }


}
