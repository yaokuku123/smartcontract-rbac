package com.yqj.service;

import com.yqj.blockchain.BlockChain;
import com.yqj.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContractService {

    @Autowired
    private BlockChain blockChain;

    //查找链上用户信息
    public SysUser findUser(String address){
        SysUser contractUser = blockChain.loadContract(address);
        return contractUser;
    }
}
