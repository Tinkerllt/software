package com.example.group14accountservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.group14accountservice.dao.AccountDao;
import com.example.group14accountservice.entity.Account;
import com.example.group14dubboapi.account.DubboAccount;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class AccountService implements DubboAccount {
    @Autowired
    private AccountDao accountDao;
    @Override
    public boolean createAccount(String userName) {
        accountDao.insert(new Account(userName,0));
        return true;
    }

    @Override
    public boolean addMoney(String userName, double money) {
        UpdateWrapper<Account> updateWrapper=new UpdateWrapper<>();
        updateWrapper.setSql("money=money+"+money).eq("user_name",userName);
        accountDao.update(null,updateWrapper);
        return true;
    }

    @Override
    public boolean reduceMoney(String userName, double money) {
        if(getMoney(userName)<money){
            return false;
        }
        else{
            UpdateWrapper<Account> updateWrapper=new UpdateWrapper<>();
            updateWrapper.setSql("money=money-"+money).eq("user_name",userName);
            accountDao.update(null,updateWrapper);
            return true;
        }
    }

    @Override
    public double getMoney(String userName) {
        QueryWrapper<Account> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_name",userName).select("money");
        return accountDao.selectOne(queryWrapper).getMoney();
    }
}
