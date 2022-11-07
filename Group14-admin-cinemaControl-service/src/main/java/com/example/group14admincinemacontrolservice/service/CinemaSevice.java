package com.example.group14admincinemacontrolservice.service;

import com.baomidou.mybatisplus.core.injector.methods.Insert;
import com.example.group14admincinemacontrolservice.dao.CinemaDao;
import com.example.group14admincinemacontrolservice.entity.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaSevice {
    @Autowired
    private CinemaDao cinemaDao;
    public void InsertCinema(Cinema cinema){
        cinemaDao.insert(cinema);
    }
    public void UpdateCinema(Cinema cinema){
        cinemaDao.update(cinema);
    }
    public void deleteCinema(int cinemaId){
        cinemaDao.delete(cinemaId);
    }
    public List<Object> selectCinemaId(){
        return cinemaDao.selectCinemaId();
    }
    public Cinema selectCinemaById(int cinemaId){
        Cinema c=new Cinema();
        c=cinemaDao.selectCinemaById(cinemaId);
        return cinemaDao.selectCinemaById(cinemaId);
    }
}
