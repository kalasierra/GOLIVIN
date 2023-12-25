package com.Group11.TugasBesar.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
    @Id
    @Column
    @GeneratedValue
    private int booking_id;

    @Column
    private String paymentStatus;

    @Column
    private java.sql.Date entryDate;

    @Column
    private java.sql.Date exitDate;

    @ManyToOne
    @JoinColumn(name = "pencariKost_id")
    private PencariKost pencariKost;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Booking() {}

    public Booking(String paymentStatus, Date entryDate, Date exitDate) {
        this.paymentStatus = paymentStatus;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
    }

    public int getBooking_id() {return booking_id;}

    public void setBooking_id(int booking_id) {this.booking_id = booking_id;}

    public String getPaymentStatus() {return paymentStatus;}

    public void setPaymentStatus(String paymentStatus) {this.paymentStatus = paymentStatus;}

    public java.sql.Date getEntryDate() {return entryDate;}

    public void setEntryDate(java.sql.Date entryDate) {this.entryDate = entryDate;}

    public java.sql.Date getExitDate() {return exitDate;}

    public void setExitDate(java.sql.Date exitDate) {this.exitDate = exitDate;}

    public PencariKost getPencariKost() {return pencariKost;}

    public void setPencariKost(PencariKost pencariKost) {this.pencariKost = pencariKost;}

    public Room getRoom() {return room;}

    public void setRoom(Room room) {this.room = room;}

    
}
