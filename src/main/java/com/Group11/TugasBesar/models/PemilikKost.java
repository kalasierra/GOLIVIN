package com.Group11.TugasBesar.models;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class PemilikKost {
    @Id
    @GeneratedValue
    @Column(name = "pemilikKost_id")
    private int PemilikKost_id;

    @OneToMany(mappedBy = "pemilikKost")
    private List<Kost> kosts = new ArrayList<>();

    public PemilikKost() {}

    public PemilikKost(int PemilikKost_id) {
        this.PemilikKost_id = PemilikKost_id;
    }

    public void setPemilikKost_id(int PemilikKost_id) {this.PemilikKost_id = PemilikKost_id;}

    public int getPemilikKost_id() {return this.PemilikKost_id;}

    public List<Kost> getKosts() {
        return kosts;
    }

    public void setKosts(List<Kost> kosts) {
        this.kosts = kosts;
    }

    
}
