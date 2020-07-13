package com.yqj.config;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: LoginHandlerIntercepter
 * Author: yaoqijun
 * Date: 2020/7/12 16:45
 */
public class LoginHandlerIntercepter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if(loginUser == null){
            request.setAttribute("msg","未登录");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }
        return true;
    }
}
