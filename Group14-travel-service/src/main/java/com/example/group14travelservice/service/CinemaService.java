package com.example.group14travelservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14travelservice.dao.CinemaDao;
import com.example.group14travelservice.dao.CinemaDaoImpl;
import com.example.group14travelservice.entity.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CinemaService {
    @Autowired
    private CinemaDao dao;
    public List<Cinema> showall(String CityName){
        return dao.serachCinemaByCityName(CityName);
    }
}
