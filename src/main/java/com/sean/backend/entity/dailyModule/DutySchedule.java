package com.sean.backend.entity.dailyModule;

import com.sean.backend.entity.labModule.Lab;
import com.sean.backend.entity.semesterModule.Semester;
import com.sean.backend.entity.userModule.Admin;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "DutySchedule")
public class DutySchedule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dsid;
    @ManyToOne
    @JoinColumn(name = "admid")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name = "labid")
    private Lab lab;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private int weekth;
    private int week_day;
    @ManyToOne
    @JoinColumn(name = "semid")
    private Semester semester;


    public int getDsid() {
        return dsid;
    }

    public void setDsid(int dsid) {
        this.dsid = dsid;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
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

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
