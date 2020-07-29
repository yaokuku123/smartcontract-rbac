package com.yqj.domain;

import javax.persistence.*;

/**
 * Copyright(C),2019-2020,XXX公司
 * FileName: SysRequest
 * Author: yaoqijun
 * Date: 2020/7/29 15:32
 */
@Entity
@Table(name = "sys_request")
public class SysRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "requestAddr")
    private String requestAddr;
    @Column(name = "sourceSubjectAddr")
    private String sourceSubjectAddr;
    @Column(name = "sourceAddr")
    private String sourceAddr;
    @Column(name = "controlAddr")
    private String controlAddr;
    @Column(name = "requestSubjectAddr")
    private String requestSubjectAddr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestAddr() {
        return requestAddr;
    }

    public void setRequestAddr(String requestAddr) {
        this.requestAddr = requestAddr;
    }

    public String getSourceSubjectAddr() {
        return sourceSubjectAddr;
    }

    public void setSourceSubjectAddr(String sourceSubjectAddr) {
        this.sourceSubjectAddr = sourceSubjectAddr;
    }

    public String getSourceAddr() {
        return sourceAddr;
    }

    public void setSourceAddr(String sourceAddr) {
        this.sourceAddr = sourceAddr;
    }

    public String getControlAddr() {
        return controlAddr;
    }

    public void setControlAddr(String controlAddr) {
        this.controlAddr = controlAddr;
    }

    public String getRequestSubjectAddr() {
        return requestSubjectAddr;
    }

    public void setRequestSubjectAddr(String requestSubjectAddr) {
        this.requestSubjectAddr = requestSubjectAddr;
    }

    @Override
    public String toString() {
        return "SysRequest{" +
                "id=" + id +
                ", requestAddr='" + requestAddr + '\'' +
                ", sourceSubjectAddr='" + sourceSubjectAddr + '\'' +
                ", sourceAddr='" + sourceAddr + '\'' +
                ", controlAddr='" + controlAddr + '\'' +
                ", requestSubjectAddr='" + requestSubjectAddr + '\'' +
                '}';
    }
}
