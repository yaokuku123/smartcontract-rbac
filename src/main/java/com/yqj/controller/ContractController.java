package com.yqj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: ContractController
 * Author: yaoqijun
 * Date: 2020/7/12 19:16
 */
@Controller
public class ContractController {

    @GetMapping("/adduser")
    public String list(){
        return "list";
    }
}
