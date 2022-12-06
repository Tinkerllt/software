package com.example.group14travelservice;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.group14travelservice.dao")
public class Group14TravelServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Group14TravelServiceApplication.class, args);
    }
}
