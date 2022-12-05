package com.example.group14userservice.response;

import com.example.group14userservice.exception.UserExceptionCodeMsg;
import com.example.group14userservice.exception.UserSuccessCodeMsg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseEnitity<T> {

    //服务端返回的错误码
    private boolean status;
    private int code = 200;
    //服务端返回的错误信息
    private String msg = "success";
    //我们服务端返回的数据
    private T data;


    public static <T> ResponseEnitity success(UserSuccessCodeMsg userSuccessCodeMsg,T data){
        ResponseEnitity responseEnitity = new ResponseEnitity(userSuccessCodeMsg.getStatus(), userSuccessCodeMsg.getCode(), userSuccessCodeMsg.getMsg(), data);
        return responseEnitity;
    }

    public static <T> ResponseEnitity success(UserSuccessCodeMsg userSuccessCodeMsg,String msg, T data){
        ResponseEnitity responseEnitity = new ResponseEnitity(userSuccessCodeMsg.getStatus(), userSuccessCodeMsg.getCode(), msg, data);
        return responseEnitity;
    }

    public static <T> ResponseEnitity error(UserExceptionCodeMsg appExceptionCodeMsg){
        ResponseEnitity responseEnitity = new ResponseEnitity(appExceptionCodeMsg.getStatus(), appExceptionCodeMsg.getCode(), appExceptionCodeMsg.getMsg(), null);
        return responseEnitity;
    }
    public static <T> ResponseEnitity error(int code, String msg){
        ResponseEnitity responseEnitity = new ResponseEnitity(false,code,msg, null);
        return responseEnitity;
    }


}
