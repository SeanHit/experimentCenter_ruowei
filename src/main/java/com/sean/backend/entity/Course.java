package com.sean.backend.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="course")
public class Course {
    @Id //主键
    private String id;

    private String name;

    private Float point;

    private String teacherid;

    public Course(){
    }

//    @ManyToOne
//    @JoinColumn(name ="teacher_id")
//    private Teacher teacher;

//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
//    private Set<Student_course> student_courses = new HashSet<Student_course>();

//    public Set<Student_course> getStudent_courses() {
//        return student_courses;
//    }

//    public void setStudent_courses(Set<Student_course> student_courses) {
//        this.student_courses = student_courses;
//    }

    public String getName() {
        return name;
    }

//    public String getTeacher_id() {
//        return teacher_id;
//    }

    public Float getPoint() {
        return point;
    }

    public String getId() {
        return id;
    }

//    public void setTeacher_id(String teacher_id) {
//        this.teacher_id = teacher_id;
//    }


    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(Float point) {
        this.point = point;
    }
}
