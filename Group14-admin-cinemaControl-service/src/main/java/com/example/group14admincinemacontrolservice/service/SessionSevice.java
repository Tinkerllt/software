package com.example.group14admincinemacontrolservice.service;

import com.example.group14admincinemacontrolservice.dao.SessionDao;
import com.example.group14admincinemacontrolservice.entity.Cinema;
import com.example.group14admincinemacontrolservice.entity.Movie;
import com.example.group14admincinemacontrolservice.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class SessionSevice {
    @Autowired
    private SessionDao sessionDao;
    public boolean DateVaildate(String s,int movieId){
        Movie movie=sessionDao.selectDate(movieId).get(0);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        Date releaseDate=null;
        Date endDate=null;
        try {
            date = format.parse(s);
            releaseDate=format.parse(movie.getReleaseDate());
            endDate=format.parse(movie.getEndDate());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        if(date.after(releaseDate)&&date.before(endDate)) return true;
        else return false;
    }
    public Map<String,Object>insertSession(Session session){
        Map<String,Object>mp=new HashMap<>();
        if (!DateVaildate(session.getScreeningDate(),session.getMovieId())){
            mp.put("success",0);
            mp.put("info","拍片日期不合适");
            return mp;
        }
        else {
            sessionDao.insertSession(session);
            mp.put("success",1);
            mp.put("info","排片成功");
            return mp;
        }
    }
}
