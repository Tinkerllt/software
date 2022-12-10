package com.example.group14cinemafilmservice.controller;

import com.example.group14cinemafilmservice.entity.CinemaFilm;
import com.example.group14cinemafilmservice.response.ResponseEnitity;
import com.example.group14cinemafilmservice.service.CinemaFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/api/v1/order/insertCinemaFilm")
    public ResponseEnitity<List<Integer>> insertCinemaFilm(@RequestBody CinemaFilm cinemaFilm){
        if (!cinemaFilmService.InsertCinemaFilm(cinemaFilm)) {
            return ResponseEnitity.error(101,"插入失败");
        }
        else return ResponseEnitity.success(cinemaFilm);
    }
    @PostMapping("/api/v1/order/deleteCinema")
    public ResponseEnitity<List<Integer>> deleteCinema(@RequestParam int cinemaId){
        if (!cinemaFilmService.DeleteCinema(cinemaId)) {
            return ResponseEnitity.error(101,"删除失败");
        }
        else return ResponseEnitity.success(cinemaId);
    }
    @PostMapping("/api/v1/order/deleteFilm")
    public ResponseEnitity<List<Integer>> deleteFilm(@RequestParam int filmId){
        if (!cinemaFilmService.DeleteFilm(filmId)) {
            return ResponseEnitity.error(101,"删除失败");
        }
        else return ResponseEnitity.success(filmId);
    }
}
