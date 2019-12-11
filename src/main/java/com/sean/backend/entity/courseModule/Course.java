package com.sean.backend.entity.courseModule;


import com.sean.backend.entity.semesterModule.Semester;
import com.sean.backend.entity.userModule.Teacher;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name="course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11)
    private int csid;
    @Column(length = 30)
    private String csNum;
    @Column(length = 30)
    private String csNo;
    @Column(length = 100)
    private String csName;
    private String csCollege;
    @Column(length = 11)
    private int csHour;
    @Column(length = 11)
    private int cskey;
    private String csCategory;
    private String csEnviroment;
    private String csFlag;
    private String stuMonitor;
    @Column(length = 20)
    private String Mon_tel;
    @Column(length = 500)
    private String extraInfo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @ManyToOne
    @JoinColumn(name = "semid")
    private Semester semester;
    @ManyToOne
    @JoinColumn(name = "teaid")
    private Teacher teacher;

    public int getCskey() {
        return cskey;
    }

    public void setCskey(int cskey) {
        this.cskey = cskey;
    }

    public int getCsid() {
        return csid;
    }

    public void setCsid(int csid) {
        this.csid = csid;
    }

    public String getCsNum() {
        return csNum;
    }

    public void setCsNum(String csNum) {
        this.csNum = csNum;
    }

    public String getCsNo() {
        return csNo;
    }

    public void setCsNo(String csNo) {
        this.csNo = csNo;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public String getCsCollege() {
        return csCollege;
    }

    public void setCsCollege(String csCollege) {
        this.csCollege = csCollege;
    }

    public int getCsHour() {
        return csHour;
    }

    public void setCsHour(int csHour) {
        this.csHour = csHour;
    }

    public String getCsCategory() {
        return csCategory;
    }

    public void setCsCategory(String csCategory) {
        this.csCategory = csCategory;
    }

    public String getCsEnviroment() {
        return csEnviroment;
    }

    public void setCsEnviroment(String csEnviroment) {
        this.csEnviroment = csEnviroment;
    }

    public String getCsFlag() {
        return csFlag;
    }

    public void setCsFlag(String csFlag) {
        this.csFlag = csFlag;
    }

    public String getStuMonitor() {
        return stuMonitor;
    }

    public void setStuMonitor(String stuMonitor) {
        this.stuMonitor = stuMonitor;
    }

    public String getMon_tel() {
        return Mon_tel;
    }

    public void setMon_tel(String mon_tel) {
        Mon_tel = mon_tel;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
