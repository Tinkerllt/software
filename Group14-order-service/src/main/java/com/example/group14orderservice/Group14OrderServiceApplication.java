package com.example.group14orderservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.example.group14orderservice.dao")
public class Group14OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Group14OrderServiceApplication.class, args);
	}

}
