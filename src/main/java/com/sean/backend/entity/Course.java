package com.sean.backend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name="course")
public class Course {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.AUTO) //自动增长
    private int csid;

    @Column(nullable = false,length = 30)
    private String name;

    @Column(name = "cs_no",nullable = false,length = 30)
    private String csNo;

    @Column(name="cs_name",nullable = false,length = 30)
    private String csName;

    private String cs_college;

    @Column(nullable = false)
    private int cs_hour;

    @Column(nullable = false)
    private int cs_key;


    private int semid;   //外键


    @Column(nullable = false)
    private String cs_category;

    private String cs_enviroment;

    @Column(length = 30, nullable = false)
    private String cs_flag;

    @Column(length = 30)
    private String stu_monitor;

    private String mon_tel;  //班长电话

    @Column(columnDefinition = "text")
    private String extea_info;

    @Column(nullable = false,columnDefinition = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date create_time;  //创建时间

//    private Teacher teacher;
    public Course(){}

}
