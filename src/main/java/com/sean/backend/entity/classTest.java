package com.sean.backend.entity;


import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity(name="classTest")
public class classTest  implements Serializable{



    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    public void setId(int id) {
        this.id = id;
    }





    private String name;

    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//    @JoinTable(
//            name="class_teacher",//中间表名
//            joinColumns={@JoinColumn(name="classid")},//当前对象id在中间表的列名
//            inverseJoinColumns={@JoinColumn(name="teacherid")}//关联的另一个表在中间表的列名
//    )
   private Set<teacherTest> teachers;

    public classTest() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<teacherTest> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<teacherTest> teachers) {
        this.teachers = teachers;
    }
}
