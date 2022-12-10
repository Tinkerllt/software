package com.example.group14cinemafilmservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14cinemafilmservice.dao.CinemaFilmDao;
import com.example.group14cinemafilmservice.entity.CinemaFilm;
import com.example.group14cinemafilmservice.response.ResponseEnitity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaFilmService {
    @Autowired
    private CinemaFilmDao cinemaFilmDao;

    public List<Integer> selectFilm(int cinemaId){
        QueryWrapper<CinemaFilm>queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cinema_id",cinemaId).select("film_id");
        List<CinemaFilm>list=cinemaFilmDao.selectList(queryWrapper);
        List<Integer>filmList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            filmList.add(list.get(i).getFilmId());
        }
        return filmList;
    }

    public List<Integer> selectCinema(int filmId){
        QueryWrapper<CinemaFilm>queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("film_id",filmId).select("cinema_id");
        List<CinemaFilm>list=cinemaFilmDao.selectList(queryWrapper);
        List<Integer>cinemaList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            cinemaList.add(list.get(i).getCinemaId());
        }
        return cinemaList;
    }
}
