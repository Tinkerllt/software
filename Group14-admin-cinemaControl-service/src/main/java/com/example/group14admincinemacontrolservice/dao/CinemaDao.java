package com.example.group14admincinemacontrolservice.dao;

import com.example.group14admincinemacontrolservice.entity.Cinema;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;

@Mapper
@Component
public class CinemaDao {
    @Autowired
    private CinemaDaoImpl dao;
    public boolean Insert(Cinema cinema){
        dao.insert(cinema);
        return true;
    }
    public boolean Update(Cinema cinema){
        dao.updateById(cinema);
        return true;
    }
}
