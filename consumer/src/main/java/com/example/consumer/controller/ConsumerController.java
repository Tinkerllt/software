package com.example.consumer.controller;

import com.example.api.DubboHelloWorld;
import com.example.group14dubboapi.account.DubboAccount;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @DubboReference
    private DubboHelloWorld dubboHelloWorld;
    @DubboReference
    private DubboAccount dubboAccount;
    @GetMapping("/api/v1/dubbo/consumer")
    public String getHello(){
        return dubboHelloWorld.sayHello("llt");
    }

    @GetMapping("/api/v1/dubbo/consumer2")
    public String getHello2(){
        dubboAccount.createAccount("llt");
        return "成功";
    }
}
