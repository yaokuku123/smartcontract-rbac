package com.yqj.dao;

import com.yqj.domain.SysResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResourceDao extends JpaRepository<SysResource,Long>, JpaSpecificationExecutor<SysResource> {
}
