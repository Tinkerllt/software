package com.example.group14accountservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.example.group14accountservice.dao")
public class Group14AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Group14AccountServiceApplication.class, args);
    }

}
