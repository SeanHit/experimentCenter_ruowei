package com.sean.backend.entity.courseModule;

import com.sean.backend.entity.labModule.Lab;
import com.sean.backend.entity.userModule.Teacher;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "schedule")
public class schedule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int schid;
    @ManyToOne
    @JoinColumn(name = "csid")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "labid")
    private Lab lab;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private int weekth;
    private int week_day;
    private int classth;
    @Temporal(TemporalType.TIMESTAMP)
    private Date applyTime;
    private int status;
    private int type;
    @Column(length = 500)
    private String refuseReason;
    @Temporal(TemporalType.TIMESTAMP)
    private Date replytime;
    @ManyToOne
    @JoinColumn(name = "teaid")
    private Teacher teacher;

    public int getSchid() {
        return schid;
    }

    public void setSchid(int schid) {
        this.schid = schid;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Lab getLab() {
        return lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWeekth() {
        return weekth;
    }

    public void setWeekth(int weekth) {
        this.weekth = weekth;
    }

    public int getWeek_day() {
        return week_day;
    }

    public void setWeek_day(int week_day) {
        this.week_day = week_day;
    }

    public int getClassth() {
        return classth;
    }

    public void setClassth(int classth) {
        this.classth = classth;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
