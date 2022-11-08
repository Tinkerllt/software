package com.example.group14admincinemacontrolservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.group14admincinemacontrolservice.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MovieDaoImpl extends BaseMapper<Movie> {
}
