package com.example.group14admincinemacontrolservice.controller;

import com.example.group14admincinemacontrolservice.entity.Cinema;
import com.example.group14admincinemacontrolservice.entity.Movie;
import com.example.group14admincinemacontrolservice.service.MovieSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RestController
public class MovieControl {
    @Autowired
    private MovieSevice movieSevice;
    @GetMapping("/api/v1/admin/getMovieId")
    public List<Object> getMovieId(HttpSession session){
        System.out.println(session.getAttribute("quanxian").toString());
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        return movieSevice.selectMovieId();
    }
    @GetMapping("/api/v1/admin/getMovieById")
    public Movie getCinemaById(HttpSession session,@RequestParam int movieId){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        return movieSevice.selectMovieById(movieId);
    }
    @PostMapping("/api/v1/admin/insMovie")
    public String insertMovie(HttpSession session,@RequestBody @Valid Movie movie, BindingResult result){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        if(result.hasErrors()){
            return "错误提示码:"+result.getFieldError().getDefaultMessage();
        }
        else {
            //do it
            movieSevice.InsertMovie(movie);
            return "插入成功";
        }

    }
    @PutMapping("/api/v1/admin/udMovieInfo")
    public String UpdateMovie(HttpSession session,@RequestBody @Valid Movie movie, BindingResult result){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        if(result.hasErrors()){
            return "错误提示码:"+result.getFieldError().getDefaultMessage();
        }
        else {
            //do it
            movieSevice.UpdateMovie(movie);
            return "更新成功";
        }

    }
    @PutMapping("/api/v1/admin/hidMovie")
    public String HiddenMovie(HttpSession session,@RequestParam int movieId){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        movieSevice.HiddenMovie(movieId);
        return "隐藏成功";
    }
    @DeleteMapping("/api/v1/admin/delMovie")
    public String DeleteMovie(HttpSession session,@RequestParam int movieId){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        movieSevice.DeleteMovie(movieId);
        return "删除成功";
    }
}
