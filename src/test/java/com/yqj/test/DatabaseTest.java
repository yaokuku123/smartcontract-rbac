package com.yqj.test;

import com.yqj.SmartContractMain;
import com.yqj.dao.UserDao;
import com.yqj.domain.SysUser;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: DatabaseTest
 * Author: yaoqijun
 * Date: 2020/7/12 19:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SmartContractMain.class)
public class DatabaseTest {


    @Autowired
    private UserDao userDao;

    @Test
    public void test1(){
        SysUser user = new SysUser();
        user.setUsername("yorick");
        user.setPassword("199748");
        user.setUserId("110");
        user.setWallet("0x183092841221");
        userDao.save(user);
    }
}
