package com.example.group14admincinemacontrolservice.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14admincinemacontrolservice.entity.Cinema;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;
import java.util.List;

@Mapper
@Component
public class CinemaDao {
    @Autowired
    private CinemaDaoImpl cinemaDaoImpl;
    public void insert(Cinema cinema){
        cinemaDaoImpl.insert(cinema);
    }
    public void update(Cinema cinema){cinemaDaoImpl.updateById(cinema);}
    public void delete(int cinemaId){
        cinemaDaoImpl.deleteById(cinemaId);
    }
    public List<Object> selectCinemaId(){
        QueryWrapper<Cinema> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("cinema_id").eq("enable_or_not",true);
        return cinemaDaoImpl.selectObjs(queryWrapper);
    }
    public Cinema selectCinemaById(int cinemaId){
        return cinemaDaoImpl.selectById(cinemaId);
    }
}
