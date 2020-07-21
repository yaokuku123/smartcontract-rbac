package com.yqj.service;

import com.yqj.blockchain.BlockChain;
import com.yqj.dao.ResourceDao;
import com.yqj.domain.SysResource;
import com.yqj.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContractService {

    @Autowired
    private BlockChain blockChain;

    @Autowired
    private ResourceDao resourceDao;

    //查找链上用户信息
    public SysUser findUser(String address){
        SysUser contractUser = blockChain.loadSubjectContract(address);
        return contractUser;
    }

    //客体资源托管
    public void objectResource(SysResource sysResource) throws Exception {
        //客体资源托管至链上合约
        String sourceAddr = blockChain.registerObjectResource(sysResource);
        sysResource.setSourceAddr(sourceAddr);
        //存储资源数据到数据库
        resourceDao.save(sysResource);
    }
}
