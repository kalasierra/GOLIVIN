package com.Group11.TugasBesar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Admin {
    @Id
    @Column(name = "admin_id")
    private int Admin_id;

    public Admin() {}

    public Admin(int Admin_id) {
        this.Admin_id = Admin_id;
    }

    public void setAdmin_id(int Admin_id) {this.Admin_id = Admin_id;}

    public int getAdmin_id() {return this.Admin_id;}
}
