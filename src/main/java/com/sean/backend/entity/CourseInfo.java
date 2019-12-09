package com.sean.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


public class CourseInfo implements Serializable {


    private  String studentid;

    private String courseName;

    private String courseId;

    private String courseTeacherName;

    private Float courseScore;

    public String getTeacherid() {
        return studentid;
    }

    public void setTeacherid(String id) {
        this.studentid= id;
    }

    public String getCourseTeacherName() {
        return courseTeacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public Float getCourseScore() {
        return courseScore;
    }

    public void setCourseTeacherName(String courseTeacherName) {
        this.courseTeacherName = courseTeacherName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseScore(Float courseScore) {
        this.courseScore = courseScore;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public CourseInfo(){

    }

    public CourseInfo(String studentid ,String courseName, String courseId,
                      String courseTeacherName, Float courseScore){
        super();
        this.studentid =studentid;
        this.courseId =courseId;
        this.courseName =courseName;
        this.courseScore =courseScore;
        this.courseTeacherName =courseTeacherName;

    }

    public CourseInfo(String studentid ,String courseName, String courseId,Float courseScore){
        super();
        this.studentid =studentid;
        this.courseId =courseId;
        this.courseName =courseName;
        this.courseScore =courseScore;
        this.courseTeacherName ="王老师";

    }

//    public CourseInfo(String studentid, String )
}
