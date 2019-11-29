package com.sean.backend.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//表示当前为实体类
@Entity(name="student")
public class Student {

    @Id //主键
    private String id;

    private String name;

    private String password;

    private String address;

    private String phone_num;

    public Student(){

    }



//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
//    private Set<Student_course> student_courses = new HashSet<Student_course>();

//
//    public Set<Student_course> getStudent_courses() {
//        return student_courses;
//    }
//
//    public void setStudent_courses(Set<Student_course> student_courses) {
//        this.student_courses = student_courses;
//    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public String getName() {
        return name;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}
