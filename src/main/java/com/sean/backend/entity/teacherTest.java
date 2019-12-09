package com.sean.backend.entity;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;



@Entity(name="teacherTest")
public class teacherTest implements Serializable {

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    public void setId(int id) {
        this.id = id;
    }


    private String name;

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
}
