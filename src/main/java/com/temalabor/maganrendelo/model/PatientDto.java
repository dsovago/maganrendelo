package com.temalabor.maganrendelo.model;


public class PatientDto {
    private String firstname;
    private String lastname;
    private String email;
    private String tel;
    private String taj;
    private String pass;

    public PatientDto(String firstname, String lastname, String email, String tel, String taj, String pass) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.tel = tel;
        this.taj = taj;
        this.pass = pass;
    }

    public PatientDto() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTaj() {
        return taj;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
