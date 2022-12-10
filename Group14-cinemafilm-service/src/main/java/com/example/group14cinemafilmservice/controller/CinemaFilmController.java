package com.example.group14cinemafilmservice.controller;

import com.example.group14cinemafilmservice.response.ResponseEnitity;
import com.example.group14cinemafilmservice.service.CinemaFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaFilmController {
    @Autowired
    private CinemaFilmService cinemaFilmService;
    @GetMapping("/api/v1/order/getFilm")
    public ResponseEnitity<List<Integer>>getFilm(@RequestParam int cinemaId){
        List<Integer>filmList=cinemaFilmService.selectFilm(cinemaId);
        if(filmList.size()==0){
            return ResponseEnitity.error(101,"该电影院没有电影");
        }
        else return ResponseEnitity.success(filmList);
    }
    @GetMapping("/api/v1/order/getCinema")
    public ResponseEnitity<List<Integer>>getCinema(@RequestParam int filmId){
        List<Integer>cinemaList=cinemaFilmService.selectCinema(filmId);
        if(cinemaList.size()==0){
            return ResponseEnitity.error(101,"该电影没有电影院播放");
        }
        else return ResponseEnitity.success(cinemaList);
    }
}
