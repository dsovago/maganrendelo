package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.model.PatientDto;
import com.temalabor.maganrendelo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    @Autowired
    PatientService patientService;

    //regisztracios adatok kuldese
    @PostMapping("/registration")
    public void regPatient(@RequestBody PatientDto patientdto) {
        patientService.newPatient(patientdto);
    }

    @GetMapping("/patient/{id}")
    public Patient findPatient(@PathVariable String id) {
        return patientService.getPatientById(Long.parseLong(id));
    }
}
