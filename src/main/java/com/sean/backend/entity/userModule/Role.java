package com.sean.backend.entity.userModule;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name="Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleid;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date joinDate;
    private String extrainfo;

//    @ManyToMany(fetch= FetchType.LAZY,targetEntity=Privilege.class)
////    @JoinTable(name = "role_priv", joinColumns = @JoinColumn(name = "roleid",referencedColumnName="roleid") ,
////            inverseJoinColumns = @JoinColumn(name = "privid",referencedColumnName="privid"))
//    private Set<Privilege> privileges = new HashSet<Privilege>();

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo;
    }

//    public Set<Privilege> getPrivileges() {
//        return privileges;
//    }
//
//    public void setPrivileges(Set<Privilege> privileges) {
//        this.privileges = privileges;
//    }
}
