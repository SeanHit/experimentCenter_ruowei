package com.sean.backend.entity.dailyModule;

import com.sean.backend.entity.labModule.Lab;
import com.sean.backend.entity.userModule.Admin;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "AttendanceRecord")
public class AttendanceRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int arid;
    @ManyToOne
    @JoinColumn(name = "admid")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name="labid")
    private Lab lab;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Temporal(TemporalType.TIMESTAMP)
    private Date punchinTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date punchoutTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date infactpunchinTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date infactpunchoutTime;
    private int theNumberOfPunch;
    private String attendMan;
    private String infactAttendMan;

    public int getArid() {
        return arid;
    }

    public void setArid(int arid) {
        this.arid = arid;
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

    public Date getPunchinTime() {
        return punchinTime;
    }

    public void setPunchinTime(Date punchinTime) {
        this.punchinTime = punchinTime;
    }

    public Date getPunchoutTime() {
        return punchoutTime;
    }

    public void setPunchoutTime(Date punchoutTime) {
        this.punchoutTime = punchoutTime;
    }

    public Date getInfactpunchinTime() {
        return infactpunchinTime;
    }

    public void setInfactpunchinTime(Date infactpunchinTime) {
        this.infactpunchinTime = infactpunchinTime;
    }

    public Date getInfactpunchoutTime() {
        return infactpunchoutTime;
    }

    public void setInfactpunchoutTime(Date infactpunchoutTime) {
        this.infactpunchoutTime = infactpunchoutTime;
    }

    public int getTheNumberOfPunch() {
        return theNumberOfPunch;
    }

    public void setTheNumberOfPunch(int theNumberOfPunch) {
        this.theNumberOfPunch = theNumberOfPunch;
    }

    public String getAttendMan() {
        return attendMan;
    }

    public void setAttendMan(String attendMan) {
        this.attendMan = attendMan;
    }

    public String getInfactAttendMan() {
        return infactAttendMan;
    }

    public void setInfactAttendMan(String infactAttendMan) {
        this.infactAttendMan = infactAttendMan;
    }
}
