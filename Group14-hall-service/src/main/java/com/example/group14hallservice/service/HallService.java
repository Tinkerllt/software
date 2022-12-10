package com.example.group14hallservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14hallservice.dao.HallDao;
import com.example.group14hallservice.entity.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HallService {
//    @Autowired
    private HallDao hallDao;

    public List<Integer> selectHall(int hallId){
        QueryWrapper<Hall> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("hall_id",hallId).select("cinema_id");
        List<Hall>list=hallDao.selectList(queryWrapper);
        List<Integer>filmList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            filmList.add(list.get(i).getCinemaId());
        }
        return filmList;
    }
}
