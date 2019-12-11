package com.sean.backend.entity.SuppliesModule;

import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Leader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "sRecieveBill")
public class sRecieveBill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long recievebillid;
    @ManyToOne
    @JoinColumn(name = "sid")
    private Supplies supplies;
    private int sNumber;

    @Temporal(TemporalType.TIMESTAMP)
    private Date applyTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date replyTime;
    private Boolean approvalStatus;
    private Boolean approvalResult;
    private String replyInfo;
    private String handoverMan;
    @ManyToOne
    @JoinColumn(name="adminid")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name="leaderid")
    private Leader leader;

    public long getRecievebillid() {
        return recievebillid;
    }

    public void setRecievebillid(long recievebillid) {
        this.recievebillid = recievebillid;
    }

    public Supplies getSupplies() {
        return supplies;
    }

    public void setSupplies(Supplies supplies) {
        this.supplies = supplies;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
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

    public String getHandoverMan() {
        return handoverMan;
    }

    public void setHandoverMan(String handoverMan) {
        this.handoverMan = handoverMan;
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
