package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Appointment;
import com.temalabor.maganrendelo.model.Doctor;
import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.model.Surgery;
import com.temalabor.maganrendelo.repository.DoctorRepository;
import com.temalabor.maganrendelo.repository.PatientRepository;
import com.temalabor.maganrendelo.repository.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    SurgeryRepository surgeryRepository;

    @GetMapping("admin/patients") // admin
    public List<Patient> patients() {
        return patientRepository.findAll();
    }

    @PostMapping("admin/patients") // admin
    void addPatient(@RequestBody Patient patient) {
        patientRepository.save(patient);
    }

    @GetMapping("/admin/doctors")
    public List<Doctor> doctors(){ return doctorRepository.findAll(); }

    @GetMapping("/admin/surgeries")
    public List<Surgery> surgeries() { return surgeryRepository.findAll(); }

    @GetMapping("/patient/{id}")
    public Patient findPatient(@PathVariable String id) {
        return patientRepository.findById(Long.parseLong(id));
    }

    @GetMapping("/doctor/{id}")
    public Doctor findDoctor(@PathVariable String id){ return doctorRepository.findById(Long.parseLong(id)); }

    @GetMapping("/doctor/{id}/patients")
    public Doctor findPatientsOfDoctor(@PathVariable String id){
        //TODO
        return null;
    }

    @GetMapping("/surgery/{id}")
    public Surgery findSurgery(@PathVariable String id) {
        return surgeryRepository.findById(Long.parseLong(id));
    }




}
