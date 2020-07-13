package com.yqj.dao;

import com.yqj.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: UserDao
 * Author: yaoqijun
 * Date: 2020/7/12 19:42
 */

public interface UserDao extends JpaRepository<SysUser,Long>, JpaSpecificationExecutor<SysUser> {

    List<SysUser> findByUsernameAndPassword(String username,String password);

    List<SysUser> findByUsername(String username);
}
