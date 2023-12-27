package com.Group11.TugasBesar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_method", length = 45)
    private String paymentMethod;

    @Column(name = "payment_amount")
    private int paymentAmount;

    @Column(name = "booking_id")
    private int bookingId;

    @Column(name = "pencari_kost_id")
    private int pencariKost;

    @Column(name = "admin_id")
    private int adminId;

    // Constructors, getters, and setters

    // Default constructor
    public Payment() {
    }

    public Payment(int paymentId, Date paymentDate, String paymentMethod, int paymentAmount, int bookingId, int pencariKost, int adminId) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.bookingId = bookingId;
        this.pencariKost = pencariKost;
        this.adminId = adminId;
    }

    public int getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getPaymentAmount() {
        return this.paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getPencariKost() {
        return this.pencariKost;
    }

    public void setPencariKost(int pencariKost) {
        this.pencariKost = pencariKost;
    }

    public int getAdminId() {
        return this.adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

 
}
