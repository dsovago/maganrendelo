package com.temalabor.maganrendelo.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class LoginData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String pass;
    private String role;

    public LoginData(String email, String pass, String role) {
        this.email = email;
        this.pass = pass;
        this.role = role;
    }

    public LoginData() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
