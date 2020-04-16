package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Appointment;
import com.temalabor.maganrendelo.model.Doctor;
import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.model.Surgery;
import com.temalabor.maganrendelo.repository.SurgeryRepository;
import com.temalabor.maganrendelo.service.AppointmentService;
import com.temalabor.maganrendelo.service.DoctorService;
import com.temalabor.maganrendelo.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SurgeryController {

    SurgeryService surgeryService;
    DoctorService doctorService;
    AppointmentService appointmentService;

    @Autowired
    public void setSurgeryService(SurgeryService surgeryService) {
        this.surgeryService = surgeryService;
    }

    @Autowired
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @Autowired
    public void setAppointmentService(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/surgery/{id}")
    public Surgery findSurgery(@PathVariable String id) {
        return surgeryService.getSurgeryById(Long.parseLong(id));
    }

    @GetMapping("/surgery/{id}/doctors")
    public List<Doctor> getDoctorsBySurgery(@PathVariable String id) {
        return  doctorService.getDoctorsBySurgery(Long.parseLong(id));
    }

    @GetMapping("/surgery/{id}/appointment")
    public List<Doctor> getDoctorsForAppoinment(@PathVariable String id) {
        return  doctorService.getDoctorsBySurgery(Long.parseLong(id));
    }

    /*@PostMapping("/surgery/{id}/appointment")
    public void newAppointment(@RequestBody Patient patient) {
        Appointment a = new Appointment()
        appointmentService.saveAppointment();}*/
}
