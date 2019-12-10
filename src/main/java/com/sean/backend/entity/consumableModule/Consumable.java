package com.sean.backend.entity.consumableModule;

import com.sean.backend.entity.userModule.Admin;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Consumable")
public class Consumable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cName;
    private String status;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="registraorid")
    private Admin admin;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;
    private int totalNumber;
    private int theRemaining;
    private int price;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
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

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getTheRemaining() {
        return theRemaining;
    }

    public void setTheRemaining(int theRemaining) {
        this.theRemaining = theRemaining;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
