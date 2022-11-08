package com.example.group14loginservice.Controller;

import com.example.group14loginservice.service.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    private UserserviceImpl userservice;

    @GetMapping("/api/v1/user/login")
    public int logIn(HttpSession session, String name, String password) {
        int ret = userservice.logIn(name, password);
        if (ret == 0 || ret == 1) {
            session.setAttribute("quanxian", ret);
        }
        return userservice.logIn(name, password);
    }

    @PostMapping("/api/v1/user/register")
    public int register(String name, String password) {
        return userservice.register(name, password);
    }

}
