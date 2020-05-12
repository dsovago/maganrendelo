package com.temalabor.maganrendelo.model;

import javax.persistence.Entity;

@Entity
public class Patient extends User{

    private String taj;

    public Patient(String firstname, String lastname, String email, String tel, String password, String role, String taj) {
        super(firstname, lastname, email, tel, password, role);
        this.taj = taj;
    }

    public Patient() {
    }

    public String getTaj() {
        return taj;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }
}