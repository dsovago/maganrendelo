package com.temalabor.maganrendelo.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Doctor extends User{

    private String category;
    @ManyToOne
    private Surgery surgery;

    public Doctor(String firstname, String lastname, String email, String tel, String category) {
        super(firstname, lastname, email, tel);
        this.category = category;
    }

    public Doctor(long id, String firstname, String lastname, String email, String tel, String category) {
        super(id, firstname, lastname, email, tel);
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
}
