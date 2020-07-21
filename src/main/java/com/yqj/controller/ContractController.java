package com.yqj.controller;

import com.yqj.domain.SysResource;
import com.yqj.domain.SysUser;
import com.yqj.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
@RequestMapping(value = "/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;

    //查看链上用户
    @PostMapping("/findUser")
    public String findUser(@RequestParam("address") String address,Map<String,Object> map){
        SysUser contractUser = contractService.findUser(address);
        map.put("contractUser",contractUser);
        return "finduser";
    }

    //客体托管资源
    @PostMapping("/objectResource")
    public String objectResource(SysResource sysResource,Map<String,Object> map) throws Exception {
        contractService.objectResource(sysResource);
        return "redirect:/user/findInfo";
    }

}
