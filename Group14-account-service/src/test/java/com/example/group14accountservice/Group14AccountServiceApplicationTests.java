package com.example.group14accountservice;

import com.example.group14accountservice.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Group14AccountServiceApplicationTests {
    @Autowired
    private AccountService accountService;
    @Test
    void contextLoads() {
        accountService.getMoney("llt1");
    }

}
