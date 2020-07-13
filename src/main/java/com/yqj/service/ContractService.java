package com.yqj.service;

import com.yqj.blockchain.BlockChain;
import com.yqj.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: ContractService
 * Author: yaoqijun
 * Date: 2020/7/13 13:26
 */
@Service
public class ContractService {

    @Autowired
    private BlockChain blockChain;


    public SysUser findUser(String address){
        SysUser contractUser = blockChain.loadContract(address);
        return contractUser;
    }
}
