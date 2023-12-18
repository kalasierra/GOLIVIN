package com.Group11.TugasBesar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PencariKost {
    @Id
    @GeneratedValue
    @Column(name = "pencariKost_id")
    private int pencariKost_id;

    @OneToOne(mappedBy = "pencariKost")
    private User user;

    public PencariKost() {}

    public PencariKost(int pencariKost_id) {
        this.pencariKost_id = pencariKost_id;
    }

    public void setPencariKost_id(int pencariKost_id) {this.pencariKost_id = pencariKost_id;}

    public void setUser(User user) {this.user = user;}

    public int getPencariKost_id() {return this.pencariKost_id;}

    public User getUser() {return this.user;}
}
