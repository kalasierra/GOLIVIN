package com.Group11.TugasBesar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "kost")
public class Kost {
    @Id
    @Column
    @GeneratedValue
    private int kost_id;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    @Column
    private String address;

    @Column
    private boolean approved;

    @ManyToOne
    @JoinColumn(name = "pemilikKost_id")
    private PemilikKost pemilikKost;

    public Kost() {}

    public Kost(String name, String phoneNumber, String address, boolean approved) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.approved = approved;
    }

    public int getKost_id() {return kost_id;}

    public void setKost_id(int kost_id) {this.kost_id = kost_id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public boolean isApproved() {return approved;}

    public void setApproved(boolean approved) {this.approved = approved;}

    public PemilikKost getPemilikKost() {return pemilikKost;}

    public void setPemilikKost(PemilikKost pemilikKost) {this.pemilikKost = pemilikKost;}

}
