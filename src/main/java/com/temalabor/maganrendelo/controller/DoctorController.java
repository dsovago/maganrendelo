package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Doctor;
import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.service.DoctorService;
import com.temalabor.maganrendelo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

    DoctorService doctorService;
    PatientService patientService;

    @Autowired
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @Autowired
    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/doctor/{id}")
    public Doctor doctorById(@PathVariable String id){ return doctorService.getDoctorById(Long.parseLong(id)); }

    @GetMapping("/doctor/{id}/patients")
    public List<Patient> findPatientsOfDoctor(@PathVariable String id){
        return patientService.getPatietsByDoctor(Long.parseLong(id));
    }

    @DeleteMapping("/doctor/{id}")
    public void deleteDoctor(@PathVariable String id) { doctorService.deleteDoctorById(Long.parseLong(id)); }


}
