package com.example.group14cinemafilmservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.group14cinemafilmservice.entity.CinemaFilm;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CinemaFilmDao extends BaseMapper<CinemaFilm> {
}
