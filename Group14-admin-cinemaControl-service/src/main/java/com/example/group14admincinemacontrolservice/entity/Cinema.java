package com.example.group14admincinemacontrolservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cinema")
@Accessors(chain = true)
public class Cinema {
    @TableId(type = IdType.AUTO)
    private int cinemaId;//电影院Id
    @Size(min = 2, max = 5, message = "长度不符合要求")
    private String cinemaName;//电影院名字

    private boolean enableOrNot;//电影院是否可用

    private String cinemaAddress;//电影院地址

    private String cinemaLocationOfCity;//电影院所在城市
}
