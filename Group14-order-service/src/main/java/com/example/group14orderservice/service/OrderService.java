package com.example.group14orderservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.group14orderservice.dao.OrderDao;
import com.example.group14orderservice.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;
    private boolean updateOrderState(int orderId,int state){
        UpdateWrapper<OrderInfo>updateWrapper=new UpdateWrapper<>();
        updateWrapper.eq("order_id",orderId).set("order_state",state);
        orderDao.update(null,updateWrapper);
        return true;
    }
    public boolean insertOrder(OrderInfo orderInfo){
        QueryWrapper<OrderInfo>queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("schedule_id",orderInfo.getScheduleId())
                .eq("order_row",orderInfo.getOrderRow())
                .eq("order_col",orderInfo.getOrderCol());
        if(orderDao.selectOne(queryWrapper)!=null){
            return false;
        }
        orderDao.insert(orderInfo);
        return true;
    }
    public double reFund(int orderId,int state){
        if(updateOrderState(orderId,state)){
            QueryWrapper<OrderInfo>queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("order_id",orderId);
            return orderDao.selectOne(queryWrapper).getOrderPrice();
        }
        else return -1;
    }
    public boolean useTikcet(int orderId,int state){
        return updateOrderState(orderId,state);
    }
}
