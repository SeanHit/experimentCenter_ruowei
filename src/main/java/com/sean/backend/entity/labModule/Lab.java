package com.sean.backend.entity.labModule;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "lab")
public class Lab implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11)
    private int labid;
    @Column(length = 100)
    private String labName;
    @Column(length = 30)
    private String buildingNo;
    private String roomNo;
    @Column(length = 11)
    private int stuNumber;
    @Column(length = 30)
    private String labCategory;
    private String labEnviroment;

    public int getLabid() {
        return labid;
    }

    public void setLabid(int labid) {
        this.labid = labid;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getLabCategory() {
        return labCategory;
    }

    public void setLabCategory(String labCategory) {
        this.labCategory = labCategory;
    }

    public String getLabEnviroment() {
        return labEnviroment;
    }

    public void setLabEnviroment(String labEnviroment) {
        this.labEnviroment = labEnviroment;
    }
}
