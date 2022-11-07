package com.example.group14travelservice.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14travelservice.entity.Cinema;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public class CinemaDao {
    @Autowired
    private CinemaDaoImpl dao;
    public List<Cinema> serachCinemaByCityName(String CityName){
        QueryWrapper<Cinema> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cinema_location_of_city",CityName);
        return dao.selectList(queryWrapper);
    }
}
