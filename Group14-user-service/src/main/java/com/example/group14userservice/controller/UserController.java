package com.example.group14userservice.controller;


import com.example.group14dubboapi.account.DubboAccount;
import com.example.group14userservice.entity.User;
import com.example.group14userservice.entity.UserInfo;
import com.example.group14userservice.exception.UserException;
import com.example.group14userservice.exception.UserExceptionCodeMsg;
import com.example.group14userservice.exception.UserSuccessCodeMsg;
import com.example.group14userservice.response.ResponseEnitity;
import com.example.group14userservice.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @DubboReference
    private DubboAccount dubboAccount;

    @PostMapping ("/api/v1/user/login")
    public ResponseEnitity<UserInfo> userLogin(@RequestParam String userName, @RequestParam String userPwd){
        UserInfo userInfo=userService.checkLogin(userName,userPwd);
        if(userInfo!=null){
            return ResponseEnitity.success(UserSuccessCodeMsg.LOGIN_OK,userInfo);
        }else {
            throw new UserException(UserExceptionCodeMsg.LOGIN_FAIL);
        }
    }
    @PostMapping("/api/v1/user/register")
    public ResponseEnitity<String> userRegister(@RequestBody User user){
        if(userService.InsertUser(user)) {
            dubboAccount.createAccount(user.getUserName());
            return ResponseEnitity.success(UserSuccessCodeMsg.REGISTER_OK,null);
        }
        else throw new UserException(UserExceptionCodeMsg.USERNAME_ALREADY_EXIST);
    }
    @GetMapping("/api/v1/user/getUserInfo")
    public ResponseEnitity<User> getUserInfo(@RequestParam String userName){
        //how to do....
        User user=userService.selectUserByName(userName);
        if(user!=null) return ResponseEnitity.success(UserSuccessCodeMsg.GET_INFO_OK,user);
        else throw new UserException(UserExceptionCodeMsg.USERNAME_NOT_EXISTS);
    }
    @PutMapping("/api/v1/user/recharge")
    public ResponseEnitity<String> userRecharge(@RequestParam String userName,@RequestParam double money){
        //how to do....
        dubboAccount.addMoney(userName,money);
        return ResponseEnitity.success(UserSuccessCodeMsg.RECHARGE_OK,null);
    }
    @GetMapping("/api/v1/user/getUserMoney")
    public ResponseEnitity<Double> userMoney(@RequestParam String userName){
        //how to do....
        return ResponseEnitity.success(UserSuccessCodeMsg.GET_INFO_OK,dubboAccount.getMoney(userName));
    }

}
