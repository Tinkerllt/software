package com.example.group14userservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.example.group14userservice.dao")

public class Group14UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Group14UserServiceApplication.class, args);
	}

}
