package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Doctor;
import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.model.Surgery;
import com.temalabor.maganrendelo.service.DoctorService;
import com.temalabor.maganrendelo.service.PatientService;
import com.temalabor.maganrendelo.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

    @Autowired
    PatientService patientService;
    @Autowired
    DoctorService doctorService;
    @Autowired
    SurgeryService surgeryService;


    @GetMapping("admin/patients")
    public List<Patient> patients() {
        return patientService.getPatients();
    }

    @GetMapping("/admin/doctors")
    public List<Doctor> doctors(){ return doctorService.getDoctors(); }

    @PostMapping("/admin/doctors")
    public void addDoctor(@RequestBody Doctor newDoctor){ doctorService.saveDoctor(newDoctor); }

    @GetMapping("/admin/surgeries")
    public List<Surgery> surgeries() { return surgeryService.getSurgeries(); }

    @PostMapping("/admin/surgeries")
    public  void addSurgery(@RequestBody Surgery newSurgery){ surgeryService.saveSurgery(newSurgery); }
}
