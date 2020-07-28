package com.yqj.controller;

import com.yqj.domain.SysControl;
import com.yqj.domain.SysResource;
import com.yqj.domain.SysUser;
import com.yqj.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String objectResource(SysResource sysResource, SysControl sysControl,
                                 Map<String, Object> map) throws Exception {
        contractService.objectResource(sysControl,sysResource);
        return "redirect:/user/findInfo";
    }

    //资源访问请求
    @GetMapping("/requestResource/{id}")
    public String requestResource(@PathVariable("id") Long id,Map<String,Object> map){
        //查询对应id的资源和访问控制内容
        SysResource sysResource = contractService.findResourceById(id);
        //查找对应控制合约地址的内容
        SysControl sysControl = contractService.findControlByAddr(sysResource.getControlAddr());
        //存储查找到的数据
        map.put("contractInfo",sysResource);
        map.put("controlInfo",sysControl);
        System.out.println(sysResource);
        System.out.println(sysControl);
        //转发到请求访问资源页面
        return "requestResource";
    }

}
