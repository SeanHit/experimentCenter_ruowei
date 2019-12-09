package com.sean.backend.entity.equipmentModule;


import com.sean.backend.entity.userModule.Admin;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name="Equipment")
public class Equipment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eid;
    private String eName;
    private String eCoding;
    private String modelNumber;
    private String status;
    private String description;
    private String address;
    private String userName;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="adminid")
    private Admin admin;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;
    private String invoiceNo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;
    private int eLife;
    private int price;
    private String manufacturer;
    private String prcture_url;
    private Boolean scrapFlag;

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteCoding() {
        return eCoding;
    }

    public void seteCoding(String eCoding) {
        this.eCoding = eCoding;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }



    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int geteLife() {
        return eLife;
    }

    public void seteLife(int eLife) {
        this.eLife = eLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrcture_url() {
        return prcture_url;
    }

    public void setPrcture_url(String prcture_url) {
        this.prcture_url = prcture_url;
    }

    public Boolean getScrapFlag() {
        return scrapFlag;
    }

    public void setScrapFlag(Boolean scrapFlag) {
        this.scrapFlag = scrapFlag;
    }
}
