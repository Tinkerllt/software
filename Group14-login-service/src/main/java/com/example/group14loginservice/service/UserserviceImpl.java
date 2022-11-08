package com.example.group14loginservice.service;

import com.example.group14loginservice.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements Userservice{
    @Autowired
    private UserDao dao;

    @Override
    public int logIn(String name, String password) {
        return dao.logIn(name, password);
    }

    @Override
    public int register(String name, String password) {
        return dao.register(name, password);
    }

}
