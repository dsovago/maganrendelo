package com.temalabor.maganrendelo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String tel;
    private Category category;

    public Doctor(String firstname, String lastname, String tel, Category category) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.tel = tel;
        this.category = category;
    }

    public Doctor(Long id, String firstname, String lastname, String tel, Category category) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.tel = tel;
        this.category = category;
    }

    public Doctor() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
