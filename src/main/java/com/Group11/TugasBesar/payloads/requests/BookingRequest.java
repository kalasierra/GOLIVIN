package com.Group11.TugasBesar.payloads.requests;

import java.util.Date;

import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.Room;

public class BookingRequest {
    private String paymentStatus;
    private Date entryDate;
    private Date exitDate;
    private PencariKost pencariKost;
    private Room room;

    public BookingRequest() {}

    public BookingRequest(String paymentStatus, Date entryDate, Date exitDate, PencariKost pencariKost, Room room) {
        this.paymentStatus = paymentStatus;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.pencariKost = pencariKost;
        this.room = room;
    }

    public String getPaymentStatus() {return paymentStatus;}

    public void setPaymentStatus(String paymentStatus) {this.paymentStatus = paymentStatus;}

    public Date getEntryDate() {return entryDate;}

    public void setEntryDate(Date entryDate) {this.entryDate = entryDate;}

    public Date getExitDate() {return exitDate;}

    public void setExitDate(Date exitDate) {this.exitDate = exitDate;}

    public PencariKost getPencariKost() {return pencariKost;}

    public void setPencariKost(PencariKost pencariKost) {this.pencariKost = pencariKost;}

    public Room getRoom() {return room;}

    public void setRoom(Room room) {this.room = room;}

}
