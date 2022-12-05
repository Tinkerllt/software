package com.example.provider.service.impl;

import com.example.api.DubboHelloWorld;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class DubboHelloWorldimpl implements DubboHelloWorld{
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
