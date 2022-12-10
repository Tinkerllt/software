package com.example.group14hallservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.group14hallservice.entity.Hall;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HallDao extends BaseMapper<Hall> {
}
