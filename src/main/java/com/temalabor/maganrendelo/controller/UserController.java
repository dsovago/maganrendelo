package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/users")
    public List<Patient> users() {
        return patientRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Patient findUser(@PathVariable String id) {
        return patientRepository.findById(Long.parseLong(id));
    }

}
