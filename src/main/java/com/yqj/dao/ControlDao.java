package com.yqj.dao;

import com.yqj.domain.SysControl;
import com.yqj.domain.SysResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: ControlDao
 * Author: yaoqijun
 * Date: 2020/7/27 19:25
 */
public interface ControlDao extends JpaRepository<SysControl,Long>, JpaSpecificationExecutor<SysControl> {
}
