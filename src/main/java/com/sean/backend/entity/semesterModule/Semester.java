package com.sean.backend.entity.semesterModule;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "semester")
public class Semester implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String semid;
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstDayDate;
    private int weekNumber;
    private String semName;
    private int isUsed;

    public String getSemid() {
        return semid;
    }

    public void setSemid(String semid) {
        this.semid = semid;
    }

    public Date getFirstDayDate() {
        return firstDayDate;
    }

    public void setFirstDayDate(Date firstDayDate) {
        this.firstDayDate = firstDayDate;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getSemName() {
        return semName;
    }

    public void setSemName(String semName) {
        this.semName = semName;
    }

    public int getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(int isUsed) {
        this.isUsed = isUsed;
    }
}
