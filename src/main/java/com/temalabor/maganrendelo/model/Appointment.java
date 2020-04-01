package com.temalabor.maganrendelo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long user_id;
    private long surgery_id;
    private LocalDateTime date;

    public Appointment(long user_id, long surgery_id, LocalDateTime date) {
        this.user_id = user_id;
        this.surgery_id = surgery_id;
        this.date = date;
    }

    public Appointment(long id, long user_id, long surgery_id, LocalDateTime date) {
        this.id = id;
        this.user_id = user_id;
        this.surgery_id = surgery_id;
        this.date = date;
    }

    public Appointment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getSurgery_id() {
        return surgery_id;
    }

    public void setSurgery_id(long surgery_id) {
        this.surgery_id = surgery_id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
