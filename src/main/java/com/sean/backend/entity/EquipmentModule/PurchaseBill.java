package com.sean.backend.entity.EquipmentModule;

import com.sean.backend.entity.UserModule.Admin;
import com.sean.backend.entity.UserModule.Leader;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;


@Entity(name="PurchaseBill")
public class PurchaseBill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long purchasebillid;
    private String eName;
    private String modelNumber;
    private String manufacturer;
    private int budget;
    private int eNumber;
    private DateTime applyTime;
    private DateTime replyTime;
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

    public DateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(DateTime applyTime) {
        this.applyTime = applyTime;
    }

    public DateTime getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(DateTime replyTime) {
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
