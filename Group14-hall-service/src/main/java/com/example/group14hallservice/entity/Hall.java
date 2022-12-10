package com.example.group14hallservice.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "hall")
public class Hall {
    @TableId(type = IdType.AUTO)
    private int hallId;
    private String hallName;
    private int hallCapacity;
    private int cinemaId;
}
