package com.temalabor.maganrendelo.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Doctor extends User{

    private String category;
    @ManyToOne
    private Surgery surgery;

    public Doctor(String firstname, String lastname, String email, String tel, String password, String role, String category) {
        super(firstname, lastname, email, tel, password, role);
        this.category = category;
    }

    public Doctor() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }
}
