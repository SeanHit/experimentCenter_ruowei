package com.sean.backend.entity.UserModule;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Admin")
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long leaderid;
    private String name;
    private String password;
    private DateTime joinDate;
    private String tel;
    private String extrainfo;
    private int type;  //默认值为：4（不可更改）用户类型，用于区别 学生，教师，管理员，领导
    @ManyToOne
    @JoinColumn(name="roleid")
    private Role role;

    public long getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(long leaderid) {
        this.leaderid = leaderid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
