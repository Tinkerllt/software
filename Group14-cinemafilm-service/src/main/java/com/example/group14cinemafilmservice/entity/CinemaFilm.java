package com.example.group14cinemafilmservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cinemafilm")
public class CinemaFilm {
    @TableId(type = IdType.AUTO)
    private int tableId;
    private int cinemaId;
    private int filmId;
}
