package com.temalabor.maganrendelo.controller;

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
public class AdminController {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    SurgeryRepository surgeryRepository;


    @GetMapping("admin/patients")
    public List<Patient> patients() {
        return patientRepository.findAll();
    }

    @PostMapping("admin/patients")
    void addPatient(@RequestBody Patient patient) {
        patientRepository.save(patient);
    }

    @GetMapping("/admin/doctors")
    public List<Doctor> doctors(){ return doctorRepository.findAll(); }

    @GetMapping("/admin/surgeries")
    public List<Surgery> surgeries() { return surgeryRepository.findAll(); }
}
