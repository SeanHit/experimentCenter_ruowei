package com.sean.backend.entity.userModule;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity(name="privilege")
public class Privilege implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int privid;
    private String name;
    private String url;
    private int parentId;
//    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Role.class, cascade = CascadeType.ALL, mappedBy = "privileges")
//    private Set<Role> roles = new HashSet<Role>();

//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }

    public int getPrivid() {
        return privid;
    }

    public void setPrivid(int privid) {
        this.privid = privid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
