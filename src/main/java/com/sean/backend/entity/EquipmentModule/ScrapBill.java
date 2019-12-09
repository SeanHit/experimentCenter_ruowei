package com.sean.backend.entity.EquipmentModule;

import com.sean.backend.entity.UserModule.Admin;
import com.sean.backend.entity.UserModule.Leader;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;


@Entity(name="ScrapBill")
public class ScrapBill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long scrapbillid;
    @OneToOne
    @JoinColumn(name="eid")
    private Equipment equipment;
    private String reason;
    private String picture_url;
    @ManyToOne
    @JoinColumn(name="adminid")
    private Admin admin;
    private DateTime applyTime;
    private String applyManExtrainfo;
    @ManyToOne
    @JoinColumn(name="leaderid")
    private Leader leader;

    private Boolean approvalStatus;
    private Boolean approvalResult;
    private String replyInfo;

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public long getScrapbillid() {
        return scrapbillid;
    }

    public void setScrapbillid(long scrapbillid) {
        this.scrapbillid = scrapbillid;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public DateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(DateTime applyTime) {
        this.applyTime = applyTime;
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
}
