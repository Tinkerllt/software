package com.example.group14admincinemacontrolservice.controller;

import com.example.group14admincinemacontrolservice.entity.Session;
import com.example.group14admincinemacontrolservice.service.SessionSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class sessionContrl {
    @Autowired
    private SessionSevice sessionSevice;
    @PostMapping("/api/v1/admin/insSession")
    public Map<String,Object> insertSession(@RequestBody @Valid Session session, BindingResult result){
        if(result.hasErrors()){
            Map<String,Object>mp=new HashMap<>();
            mp.put("success",0);
            mp.put("info",result.getFieldError().getDefaultMessage());
            return mp;
        }
        else {
            //do it
            return sessionSevice.insertSession(session);
        }
    }

}
