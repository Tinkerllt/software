package com.example.group14loginservice.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int logIn(String name, String password){

        //0普通用户，1管理员，2登录失败
        //找不到用户名
        if(jdbcTemplate.queryForList("SELECT * FROM user WHERE name = ?", name).isEmpty()){
            System.out.println("用户名错误");
            return 2;
        }
        //找到用户名
        if(!jdbcTemplate.queryForList("SELECT * FROM user WHERE name = ?", name).isEmpty()){
            String check = jdbcTemplate.queryForObject("SELECT password FROM user WHERE name = ?", String.class, name);
            //System.out.println(check);
            if(check.equals(password) && name.equals("admin")){
                System.out.println("管理员登录成功");
                return 1;
            }
            if(check.equals(password)){
                System.out.println("普通用户登录成功");
                return 0;
            }
            else {
                System.out.println("密码错误");
                return 2;
            }
        }
        return 2;
    }
    public int register(String name, String password){

        if(name.equals("admin")){
            System.out.println("不能注册管理员");
            return 1;
        }
        //没找到name，可以注册
        if(jdbcTemplate.queryForList("SELECT * FROM user WHERE name = ?", name).isEmpty()){
            jdbcTemplate.update("insert into user (name, password, email, role, headImg) values(?, ?, 0, 0, 0)", name, password);
            System.out.println("注册成功");
            return 0;
        }
        //注册失败
        else{
            System.out.println("用户名已被占用，注册失败");
            return 1;
        }


    }
}
