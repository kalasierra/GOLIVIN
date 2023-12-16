package com.Group11.TugasBesar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PemilikKost {
    @Id
    @GeneratedValue
    @Column(name = "pemilikKost_id")
    private int PemilikKost_id;

    public PemilikKost() {}

    public PemilikKost(int PemilikKost_id) {
        this.PemilikKost_id = PemilikKost_id;
    }

    public void setPemilikKost_id(int PemilikKost_id) {this.PemilikKost_id = PemilikKost_id;}

    public int getPemilikKost_id() {return this.PemilikKost_id;}
}
