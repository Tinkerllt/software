package com.example.group14admincinemacontrolservice.service;

import com.example.group14admincinemacontrolservice.dao.MovieDao;
import com.example.group14admincinemacontrolservice.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieSevice {
    @Autowired
    private MovieDao movieDao;

    public void InsertMovie(Movie movie){
        movieDao.insert(movie);
    }
    public void UpdateMovie(Movie movie){
        movieDao.updateMovieInfo(movie);
    }
    public void HiddenMovie(int movieId){
        movieDao.hideMovie(movieId);
    }
    public void DeleteMovie(int movieId){
        movieDao.deleteMovie(movieId);
    }
    public List<Object> selectMovieId(){
        return movieDao.selectMovieId();
    }
    public Movie selectMovieById(int movieId){
        return movieDao.selectMovieById(movieId);
    }
}
