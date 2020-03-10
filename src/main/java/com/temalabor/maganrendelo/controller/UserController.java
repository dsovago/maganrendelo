package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> users() {
        return (List<Patient>)patientRepository.findAll();
    }

    @PostMapping("/patients")
    void addUser(@RequestBody Patient patient) {
        patientRepository.save(patient);
    }

}
