package com.yqj.controller;

import com.yqj.domain.SysResource;
import com.yqj.domain.SysUser;
import com.yqj.service.ContractService;
import com.yqj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;


//用于对登录和注册进行控制
@Controller
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private ContractService contractService;

    //登录的控制
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        SysUser sysUser = userService.checkUser(username, password);
        if (sysUser != null) {
            session.setAttribute("loginUser", username);
            return "redirect:/user/findInfo";
        } else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }

    //注册主体的控制
    @PostMapping(value = "/register")
    public String register(SysUser sysUser,Map<String, Object> map,
                           HttpSession session) throws Exception {
        
        userService.registerUser(sysUser);
        return "redirect:/";
    }

    //返回主页，查询用户和资源托管信息
    @GetMapping("/findInfo")
    public String findInfo(Map<String, Object> map, HttpSession session) {
        //查询当前用户信息
        String loginUser = (String) session.getAttribute("loginUser");
        SysUser sysUser = userService.findInfo(loginUser);
        map.put("userInfo", sysUser);
        //查询客体托管资源信息
        List<SysResource> sysResources = contractService.finaAllResource();
        map.put("resourceInfo",sysResources);
        return "dashboard";
    }
}
