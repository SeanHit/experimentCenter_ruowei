package com.sean.backend.entity.equipmentModule;

import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Leader;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity(name="ePurchaseBill")
public class ePurchaseBill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long purchasebillid;
    private String eName;
    private String modelNumber;
    private String manufacturer;
    private int budget;
    private int eNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private Date applyTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date replyTime;
    private String applyManExtrainfo;
    private Boolean approvalStatus;
    private Boolean approvalResult;
    private String replyInfo;
    @ManyToOne
    @JoinColumn(name="adminid")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name="leaderid")
    private Leader leader;

    public long getPurchasebillid() {
        return purchasebillid;
    }

    public void setPurchasebillid(long purchasebillid) {
        this.purchasebillid = purchasebillid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int geteNumber() {
        return eNumber;
    }

    public void seteNumber(int eNumber) {
        this.eNumber = eNumber;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getApplyManExtrainfo() {
        return applyManExtrainfo;
    }

    public void setApplyManExtrainfo(String applyManExtrainfo) {
        this.applyManExtrainfo = applyManExtrainfo;
    }

    public Boolean getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Boolean getApprovalResult() {
        return approvalResult;
    }

    public void setApprovalResult(Boolean approvalResult) {
        this.approvalResult = approvalResult;
    }

    public String getReplyInfo() {
        return replyInfo;
    }

    public void setReplyInfo(String replyInfo) {
        this.replyInfo = replyInfo;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }
}
