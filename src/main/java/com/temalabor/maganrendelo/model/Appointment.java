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
    private long patient_id;
    private long doctor_id;
    private LocalDateTime date;

    public Appointment(long patient_id, long doctor_id, LocalDateTime date) {
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.date = date;
    }

    public Appointment(long id, long patient_id, long surgery_id, LocalDateTime date) {
        this.id = id;
        this.patient_id = patient_id;
        this.doctor_id = surgery_id;
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

    public long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(long patient_id) {
        this.patient_id = patient_id;
    }

    public long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
