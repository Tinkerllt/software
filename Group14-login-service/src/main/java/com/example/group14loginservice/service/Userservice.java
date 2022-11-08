package com.example.group14loginservice.service;

import org.springframework.stereotype.Service;


public interface Userservice {
    int logIn(String name, String password);
    int register(String name, String password);
}
