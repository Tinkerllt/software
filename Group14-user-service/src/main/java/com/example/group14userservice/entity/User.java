package com.example.group14userservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
@Accessors(chain = true)
public class User {
    @TableId(type = IdType.AUTO)
    private int userId;
    private String userName;
    private String userPwd;
    private String userEmail;
    private int userRole;
    private String userHeadimg;
}
