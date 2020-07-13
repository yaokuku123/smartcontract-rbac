package com.yqj.controller;

import com.yqj.domain.SysUser;
import com.yqj.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: ContractController
 * Author: yaoqijun
 * Date: 2020/7/12 19:16
 */
@Controller
@RequestMapping(value = "/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;

    //查看链上用户
    @PostMapping("/findUser")
    public String findUser(@RequestParam("address") String address,
                           Map<String,Object> map){
        SysUser contractUser = contractService.findUser(address);
        map.put("contractUser",contractUser);
        return "finduser";
    }

}
