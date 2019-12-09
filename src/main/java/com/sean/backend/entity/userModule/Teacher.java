package com.sean.backend.entity.userModule;


import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name="Teacher")
public class Teacher implements Serializable {
    @Id
    @Column(length = 30)
    private String teacherid;
    private String tName;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date joinDate;
    private String tel;
    private String extrainfo;
    private int type;
    @ManyToOne
    @JoinColumn(name="roleid")
    private Role role;

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
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
