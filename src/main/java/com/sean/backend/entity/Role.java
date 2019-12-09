package com.sean.backend.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



@Entity(name = "tb_role")

public class Role implements Serializable {

    private static final long serialVersionUID = -7625883839295666830L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;

    private String name;

    private String description;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL, mappedBy = "roles")
    private Set<User> users;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }


}
