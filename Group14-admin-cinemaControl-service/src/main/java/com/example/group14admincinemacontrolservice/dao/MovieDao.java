package com.example.group14admincinemacontrolservice.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.group14admincinemacontrolservice.entity.Cinema;
import com.example.group14admincinemacontrolservice.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public class MovieDao {
    @Autowired
    private MovieDaoImpl movieDaoImpl;

    public void insert(Movie movie){movieDaoImpl.insert(movie);}
    public void updateMovieInfo(Movie movie){
        movieDaoImpl.updateById(movie);
    }
    public void hideMovie(int movieId){
        UpdateWrapper<Movie> updateWrapper=new UpdateWrapper();
        updateWrapper.eq("movie_id",movieId).set("hidden_or_not",1);
        movieDaoImpl.update(null, updateWrapper);
    }
    public void deleteMovie(int movieId){
        movieDaoImpl.deleteById(movieId);
    }
    public List<Object> selectMovieId(){
        QueryWrapper<Movie> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("movie_id");
        return movieDaoImpl.selectObjs(queryWrapper);
    }
    public  Movie selectMovieById(int movieId){
        return movieDaoImpl.selectById(movieId);
    }
}
