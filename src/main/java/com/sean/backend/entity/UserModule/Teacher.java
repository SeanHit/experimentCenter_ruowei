package com.sean.backend.entity.UserModule;


import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity(name="Teacher")
public class Teacher implements Serializable {
    @Id
    private long teacherid;
    private String tName;
    private String password;
    private DateTime joinDate;
    private String tel;
    private String extrainfo;
    private int type;
    @ManyToOne
    @JoinColumn(name="roleid")
    private Role role;

    public long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(long teacherid) {
        this.teacherid = teacherid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(DateTime joinDate) {
        this.joinDate = joinDate;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
