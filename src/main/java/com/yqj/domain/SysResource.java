package com.yqj.domain;

import javax.persistence.*;
//用于描述客体托管信息
@Entity
@Table(name = "sys_resource")
public class SysResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "subjectaddr")
    private String subjectAddr;
    @Column(name = "subjectname")
    private String subjectName;
    @Column(name = "sourcename")
    private String sourceName;
    @Column(name = "source")
    private String source;
    @Column(name = "sourceaddr")
    private String sourceAddr;
    @Column(name = "controlAddr")
    private String controlAddr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectAddr() {
        return subjectAddr;
    }

    public void setSubjectAddr(String subjectAddr) {
        this.subjectAddr = subjectAddr;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    @Override
    public String toString() {
        return "SysResource{" +
                "id=" + id +
                ", subjectAddr='" + subjectAddr + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", source='" + source + '\'' +
                ", sourceAddr='" + sourceAddr + '\'' +
                ", controlAddr='" + controlAddr + '\'' +
                '}';
    }
}
