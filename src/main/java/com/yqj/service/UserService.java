package com.yqj.service;

import com.yqj.dao.UserDao;
import com.yqj.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: UserService
 * Author: yaoqijun
 * Date: 2020/7/12 20:00
 */
//用于对登录用户进行相关操作
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    //通过数据库存储的用户数据检测是否登录成功
    public SysUser checkUser(String username,String password){
        List<SysUser> users = userDao.findByUsernameAndPassword(username, password);
        if (users.size() == 0){
            return null;
        }else {
            return users.get(0);
        }
    }

    //注册用户，在该方法中需要首先调用solidity将用户注册上链，之后将用户信息保存到数据库中
    public SysUser registerUser(String username,String password,String userId){
        //调用solidity将用户注册上链

        //保存到数据库
        SysUser sysUser = new SysUser();
        sysUser.setUsername(username);
        sysUser.setPassword(password);
        sysUser.setUserId(userId);
        sysUser.setWallet("0x1234567890");
        userDao.save(sysUser);
        return sysUser;
    }
}
