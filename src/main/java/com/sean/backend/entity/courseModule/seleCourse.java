package com.sean.backend.entity.courseModule;

import com.sean.backend.entity.userModule.Student;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "seleCourse")
public class seleCourse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int selid;
    @ManyToOne
    @JoinColumn(name = "sid")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "csid")
    private Course course;
    @Temporal(TemporalType.TIMESTAMP)
    private Date selectTime;
    private float score;

    public int getSelid() {
        return selid;
    }

    public void setSelid(int selid) {
        this.selid = selid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getSelectTime() {
        return selectTime;
    }

    public void setSelectTime(Date selectTime) {
        this.selectTime = selectTime;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
