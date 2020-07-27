package com.yqj.service;

import com.yqj.blockchain.BlockChain;
import com.yqj.dao.ControlDao;
import com.yqj.dao.ResourceDao;
import com.yqj.domain.SysControl;
import com.yqj.domain.SysResource;
import com.yqj.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class ContractService {

    @Autowired
    private BlockChain blockChain;

    @Autowired
    private ResourceDao resourceDao;

    @Autowired
    private ControlDao controlDao;

    //查找链上用户信息
    public SysUser findUser(String address){
        SysUser contractUser = blockChain.loadSubjectContract(address);
        return contractUser;
    }

    //生成客体资源的访问策略,并将客体资源托管
    public void objectResource(SysControl sysControl,SysResource sysResource) throws Exception {
        //将策略托管至链上合约
        String controlAddr = blockChain.registerControlContract(sysControl);
        sysControl.setControlAddr(controlAddr);
        sysResource.setControlAddr(controlAddr);
        //客体资源托管至链上合约
        String sourceAddr = blockChain.registerObjectResource(sysResource);
        sysResource.setSourceAddr(sourceAddr);
        //存储访问策略到数据库
        controlDao.save(sysControl);
        //存储资源数据到数据库
        resourceDao.save(sysResource);
    }

    //查询全部托管的资源信息
    public List<SysResource> finaAllResource(){
        List<SysResource> sysResources = resourceDao.findAll();
        return sysResources;
    }

}
