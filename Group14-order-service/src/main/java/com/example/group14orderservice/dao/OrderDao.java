package com.example.group14orderservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.group14orderservice.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public interface OrderDao extends BaseMapper<OrderInfo> {
}
