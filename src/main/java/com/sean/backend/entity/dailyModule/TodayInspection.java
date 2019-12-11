package com.sean.backend.entity.dailyModule;

import com.sean.backend.entity.labModule.Lab;
import com.sean.backend.entity.userModule.Admin;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "TodayInspection")
public class TodayInspection implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tiid;
    @ManyToOne
    @JoinColumn(name = "admid")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name="labid")
    private Lab lab;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private int weekth;
    private boolean firstInspectionStatus;
    private boolean secondInspectionStatus;
    private boolean thirdInspectionStatus;
    private boolean fourthInspectionStatus;
    private String inspectionContent;
    private String inspectionTitle;
    @Temporal(TemporalType.TIMESTAMP)
    private Date submitTime;

    public int getTiid() {
        return tiid;
    }

    public void setTiid(int tiid) {
        this.tiid = tiid;
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

    public boolean isFirstInspectionStatus() {
        return firstInspectionStatus;
    }

    public void setFirstInspectionStatus(boolean firstInspectionStatus) {
        this.firstInspectionStatus = firstInspectionStatus;
    }

    public boolean isSecondInspectionStatus() {
        return secondInspectionStatus;
    }

    public void setSecondInspectionStatus(boolean secondInspectionStatus) {
        this.secondInspectionStatus = secondInspectionStatus;
    }

    public boolean isThirdInspectionStatus() {
        return thirdInspectionStatus;
    }

    public void setThirdInspectionStatus(boolean thirdInspectionStatus) {
        this.thirdInspectionStatus = thirdInspectionStatus;
    }

    public boolean isFourthInspectionStatus() {
        return fourthInspectionStatus;
    }

    public void setFourthInspectionStatus(boolean fourthInspectionStatus) {
        this.fourthInspectionStatus = fourthInspectionStatus;
    }

    public String getInspectionContent() {
        return inspectionContent;
    }

    public void setInspectionContent(String inspectionContent) {
        this.inspectionContent = inspectionContent;
    }

    public String getInspectionTitle() {
        return inspectionTitle;
    }

    public void setInspectionTitle(String inspectionTitle) {
        this.inspectionTitle = inspectionTitle;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
}
