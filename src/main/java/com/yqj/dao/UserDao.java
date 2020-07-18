package com.yqj.dao;

import com.yqj.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;




public interface UserDao extends JpaRepository<SysUser,Long>, JpaSpecificationExecutor<SysUser> {

    List<SysUser> findByUsernameAndPassword(String username,String password);

    List<SysUser> findByUsername(String username);
}
