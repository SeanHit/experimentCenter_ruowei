package com.sean.backend.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity(name="tb_user")

public class User implements Serializable {

    private static final long serialVersionUID = 576770011136181361L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String loginName;


    private String phone;

    private String email;

    private String description;

   @ManyToMany(fetch = FetchType.LAZY, targetEntity = Role.class)
   @JoinTable(name = "User_Role",
           joinColumns = @JoinColumn(name = "userId"),
           inverseJoinColumns = @JoinColumn(name = "roleId"))
    private Set<Role> roles=new HashSet<>();

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    private String name;

    private String gender;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }




}
