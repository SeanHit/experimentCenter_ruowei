package com.sean.backend.entity.EquipmentModule;

import com.sean.backend.entity.UserModule.Admin;
import com.sean.backend.entity.UserModule.Leader;
import com.sean.backend.entity.equipmentModule.Equipment;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="RepairBill")
public class RepairBill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long repairbillid;
    @ManyToOne
    @JoinColumn(name="eid")
    private Equipment equipment;
    private String description;
    private String picture_url;
    @ManyToOne
    @JoinColumn(name="adminid")
    private Admin admin;
    private DateTime applyTime;
    private String applyManExtrainfo;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="leaderid")
    private Leader leader;



    private Boolean approvalStatus;
    private Boolean approvalResult;
    private String faultCause;
    private String solution;
    private String repairMan;
    private String repairManExtrainfo;
    private DateTime repairDate;
    private String tel;
    private int cost;
    private String replyInfo;

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }


    public long getRepairbillid() {
        return repairbillid;
    }

    public void setRepairbillid(long repairbillid) {
        this.repairbillid = repairbillid;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getFaultCause() {
        return faultCause;
    }

    public void setFaultCause(String faultCause) {
        this.faultCause = faultCause;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getRepairMan() {
        return repairMan;
    }

    public void setRepairMan(String repairMan) {
        this.repairMan = repairMan;
    }

    public String getRepairManExtrainfo() {
        return repairManExtrainfo;
    }

    public void setRepairManExtrainfo(String repairManExtrainfo) {
        this.repairManExtrainfo = repairManExtrainfo;
    }

    public DateTime getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(DateTime repairDate) {
        this.repairDate = repairDate;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getReplyInfo() {
        return replyInfo;
    }

    public void setReplyInfo(String replyInfo) {
        this.replyInfo = replyInfo;
    }
}
