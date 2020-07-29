package com.yqj.dao;

import com.yqj.domain.SysRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: ControlDao
 * Author: yaoqijun
 * Date: 2020/7/27 19:25
 */
public interface RequestDao extends JpaRepository<SysRequest,Long>, JpaSpecificationExecutor<SysRequest> {
}
