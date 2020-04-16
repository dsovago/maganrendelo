package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.model.Appointment;
import com.temalabor.maganrendelo.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    AppointmentRepository appointmentRepository;

    @Autowired
    public void setAppointmentRepository(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

//    public List<Appointment> getAppointmentsByPatient(long id) { return appointmentRepository.findByPatient_id(id); }
//
//    public List<Appointment> getAppointmentsByDoctor(long id) {return appointmentRepository.findByDoctor_id(id); }
}