package com.example.group14travelservice.service;

import com.example.group14travelservice.dao.MovieDao;
import com.example.group14travelservice.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieDao dao;

    public List<Movie> showall(){
        return dao.selectList(null);
    }
}
