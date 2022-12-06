package com.example.group14dubboapi.account;

public interface DubboAccount {
    public boolean createAccount(String userName);
    public boolean addMoney(String userName,double money);
    public boolean reduceMoney(String userName,double money);
    public double getMoney(String userName);
}
