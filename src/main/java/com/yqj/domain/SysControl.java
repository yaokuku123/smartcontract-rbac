package com.yqj.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: SysControl
 * Author: yaoqijun
 * Date: 2020/7/27 19:14
 */
//用于描述权限控制信息
@Entity
@Table(name = "sys_control")
public class SysControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "transTime")
    private long transTime;
    @Column(name = "role")
    private String role;
    @Column(name = "price")
    private Long price;
    @Column(name = "controlAddr")
    private String controlAddr;
    @Column(name = "startTime")
    private String startTime;
    @Column(name = "stopTime")
    private String stopTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTransTime() {
        return transTime;
    }

    public void setTransTime(long transTime) {
        this.transTime = transTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getControlAddr() {
        return controlAddr;
    }

    public void setControlAddr(String controlAddr) {
        this.controlAddr = controlAddr;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public String toString() {
        return "SysControl{" +
                "id=" + id +
                ", transTime=" + transTime +
                ", role='" + role + '\'' +
                ", price=" + price +
                ", controlAddr='" + controlAddr + '\'' +
                ", startTime=" + startTime +
                ", stopTime=" + stopTime +
                '}';
    }
}
