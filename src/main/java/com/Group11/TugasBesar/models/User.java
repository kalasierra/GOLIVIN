package com.Group11.TugasBesar.models;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    @UuidGenerator
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    public User() {}

    public User(String id, String username, String password, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public String getId() {return this.id;}

    public String getUsername() {return this.username;}
    
    public String getPhoneNumber() {return this.phoneNumber;}

    public String getEmail() {return this.email;}

    public String getPassword() {return this.password;}

    public void setId(String id) {this.id = id;}

    public void setUsername(String username) {this.username = username;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public void setEmail(String email) {this.email = email;}
    
    public void setPassword(String password) {this.password = password;}
  }
