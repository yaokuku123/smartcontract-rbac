package com.yqj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: MvcConfig
 * Author: yaoqijun
 * Date: 2020/7/12 15:51
 */
@Configuration
public class MvcConfig {

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/register.html").setViewName("register");
                registry.addViewController("/list.html").setViewName("list");
                registry.addViewController("/finduser.html").setViewName("finduser");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
                        .excludePathPatterns("/","/register.html","/user/login","/user/register","/asserts/**","/css/**","/plugins/**");
            }
        };
        return adapter;
    }

}
