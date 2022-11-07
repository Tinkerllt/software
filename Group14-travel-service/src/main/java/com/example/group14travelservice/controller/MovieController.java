package com.example.group14travelservice.controller;

import com.example.group14travelservice.entity.Movie;
import com.example.group14travelservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/api/v1/tavel/movie")
    public List<Movie> showall(){
        return movieService.showall();
    }
}
