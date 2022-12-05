package com.example.group14userservice.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ResultEnum {
    OK(true,200, "OK"),//用于服务器有实体响应
    CREATED(true,201, "Created"),//创建了新实体，响应该实体
    NO_CONTENT(true,204, "No Content"),//服务器正常响应，但无实体响应
    BAD_REQUEST(false,400, "Bad Request"),//客户端请求语法错误
    NOT_FOUND(false,404, "Not Found"),//目标资源不存在
    INTERNAL_SERVER_ERROR(false,500, "Internal Server Error"),//服务器内部错误
    NOT_IMPLEMENTED(false,501, "Not Implemented");
    private Boolean success;
    private Integer code;
    private String message;

}
