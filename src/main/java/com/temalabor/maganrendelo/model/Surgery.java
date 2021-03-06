package com.temalabor.maganrendelo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Surgery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String opening;
    private String email;
    private String tel;
    private String info;
    @OneToMany(mappedBy = "surgery")
    private List<Doctor> doctors;

    public Surgery(String name, String address, String opening, String email, String tel, String info, List<Doctor> doctors) {
        this.name = name;
        this.address = address;
        this.opening = opening;
        this.email = email;
        this.tel = tel;
        this.info = info;
        this.doctors = doctors;
    }

    public Surgery(long id, String name, String address, String opening, String email, String tel, String info, List<Doctor> doctors) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.opening = opening;
        this.email = email;
        this.tel = tel;
        this.info = info;
        this.doctors = doctors;
    }

    public Surgery() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
}