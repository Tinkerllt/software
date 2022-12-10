package com.example.group14hallservice.response;

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

    public static <T> ResponseEnitity success(T data){
        ResponseEnitity responseEnitity = new ResponseEnitity(true,100, "获取成功", data);
        return responseEnitity;
    }
    public static <T> ResponseEnitity error(int code, String msg){
        ResponseEnitity responseEnitity = new ResponseEnitity(false,code,msg, null);
        return responseEnitity;
    }


}