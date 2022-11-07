package com.example.group14admincinemacontrolservice.service;

import com.baomidou.mybatisplus.core.injector.methods.Insert;
import com.example.group14admincinemacontrolservice.dao.CinemaDao;
import com.example.group14admincinemacontrolservice.entity.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaSevice {
    @Autowired
    private CinemaDao dao;
    public boolean InsertCinema(Cinema cinema){
        if(dao.Insert(cinema)){
            return true;
        }
        else return false;
    }
}
