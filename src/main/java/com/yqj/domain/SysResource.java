package com.yqj.domain;

import javax.persistence.*;

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
    @Column(name = "role")
    private String role;
    @Column(name = "sourceaddr")
    private String sourceAddr;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSourceAddr() {
        return sourceAddr;
    }

    public void setSourceAddr(String sourceAddr) {
        this.sourceAddr = sourceAddr;
    }

    @Override
    public String toString() {
        return "SysResource{" +
                "id=" + id +
                ", subjectAddr='" + subjectAddr + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", source='" + source + '\'' +
                ", role='" + role + '\'' +
                ", sourceAddr='" + sourceAddr + '\'' +
                '}';
    }
}
