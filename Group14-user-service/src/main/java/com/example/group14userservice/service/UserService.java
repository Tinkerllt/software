package com.example.group14userservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.group14userservice.dao.UserDao;
import com.example.group14userservice.entity.User;
import com.example.group14userservice.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    private User selectUserByNameMethod(String userName){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_name",userName);
        return userDao.selectOne(queryWrapper);
    }
    public UserInfo checkLogin(String userName,String passWord){
        User user=selectUserByNameMethod(userName);
        if(user==null||!user.getUserPwd().equals(passWord)){
            return null;
        }
        else {
            return new UserInfo(userName,user.getUserRole()==1?"admin":"user");
        }
    }
    public boolean InsertUser(User user){
        User Euser=selectUserByNameMethod(user.getUserName());
        if(Euser!=null){
            return false;
        }
        else {
            userDao.insert(user);
            return true;
        }
    }
    public User selectUserByName(String userName){
        User user=selectUserByNameMethod(userName);
        return user;
    }
}
