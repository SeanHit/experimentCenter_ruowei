package com.sean.backend.entity.consumableModule;

import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Leader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "cPurchaseBill")
public class cPurchaseBill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long purchasebillid;
    private String cName;

    private int budget;
    private int cNumber;
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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getcNumber() {
        return cNumber;
    }

    public void setcNumber(int cNumber) {
        this.cNumber = cNumber;
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
