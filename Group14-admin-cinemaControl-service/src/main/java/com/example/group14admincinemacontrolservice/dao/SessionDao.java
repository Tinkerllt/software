package com.example.group14admincinemacontrolservice.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14admincinemacontrolservice.entity.Movie;
import com.example.group14admincinemacontrolservice.entity.Session;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public class SessionDao {
    @Autowired
    private MovieDaoImpl movieDaoImpl;
    @Autowired
    private SessionDaoImpl sessionDaoImpl;
    public List<Movie> selectDate(int movieId){
        QueryWrapper<Movie> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("movie_id",movieId);
        return movieDaoImpl.selectList(queryWrapper);
    }
    public void insertSession(Session session){
        sessionDaoImpl.insert(session);
    }
}
