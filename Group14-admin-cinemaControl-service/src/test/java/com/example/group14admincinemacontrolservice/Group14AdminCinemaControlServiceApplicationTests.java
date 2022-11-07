package com.example.group14admincinemacontrolservice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14admincinemacontrolservice.dao.CinemaDaoImpl;
import com.example.group14admincinemacontrolservice.dao.MovieDaoImpl;
import com.example.group14admincinemacontrolservice.dao.SessionDao;
import com.example.group14admincinemacontrolservice.dao.SessionDaoImpl;
import com.example.group14admincinemacontrolservice.entity.Cinema;
import com.example.group14admincinemacontrolservice.entity.Movie;
import com.example.group14admincinemacontrolservice.entity.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Group14AdminCinemaControlServiceApplicationTests {

    @Autowired
    private SessionDao sessionDao;
    @Test
    void contextLoads() {
        Movie movie=new Movie();
        movie=sessionDao.selectDate(1).get(0);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        Date releaseDate=null;
        Date endDate=null;
        try {
            date = format.parse("2022-08-11");
            releaseDate=format.parse(movie.getReleaseDate());
            endDate=format.parse(movie.getEndDate());
            System.out.println(date);
            System.out.println(releaseDate);
            System.out.println(endDate);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        if(date.after(releaseDate)&&date.before(endDate)) System.out.println("1");
        else System.out.println("0");
    }

}
