package com.example.group14orderservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14orderservice.dao.OrderDao;
import com.example.group14orderservice.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class SeatSevice  {
    @Autowired
    private OrderDao orderDao;

    public boolean[][] selectSeat(int scheduleId) {
        boolean[][] seat = new boolean[12][12];
        for (int i = 0; i < seat.length; i++) {
            Arrays.fill(seat[i], true);
        }
        QueryWrapper<OrderInfo>queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("schedule_id",scheduleId).ne("order_state",2).select("order_row","order_col");
        List<OrderInfo>seatlist=orderDao.selectList(queryWrapper);
        for(int i=0;i<seatlist.size();i++){
            seat[seatlist.get(i).getOrderRow()-1][seatlist.get(i).getOrderCol()-1]=false;
        }
        return seat;
    }
}
