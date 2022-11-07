package com.example.group14admincinemacontrolservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "movie")
public class Movie {
    @TableId(type = IdType.AUTO)
    private int movieId;//电影Id
    private String movieName;//电影名
    private String movieDuration;//电影时长
    private String releaseDate;//上映日期
    private String endDate;//下架日期
    private boolean hiddenOrNot;//是否隐藏
    private String movieInfo;//电影信息
}
