package com.github.miemiedev.sht.entity;


import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends IdEntity {
    private String name;
    private String rtx;
    private String ip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRtx() {
        return rtx;
    }

    public void setRtx(String rtx) {
        this.rtx = rtx;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}