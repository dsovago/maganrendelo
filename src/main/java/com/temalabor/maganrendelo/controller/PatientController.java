package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.model.PatientDto;
import com.temalabor.maganrendelo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    PatientService patientService;

    @Autowired
    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    //regisztracios adatok kuldese
    @PostMapping("/registration")
    public void regPatient(@RequestBody Patient patient) {
        patientService.newPatient(patient);
    }

    //paciens lekerdezese id szerint
    @GetMapping("/patient/{id}")
    public Patient findPatient(@PathVariable String id) {
        return patientService.getPatientById(Long.parseLong(id));
    }

    //adatok szerkesztese
    @GetMapping("/patient/{id}/edit")
    public Patient getPatientsData(@PathVariable String id) {
        return patientService.getPatientById(Long.parseLong(id));
    }

    @PostMapping("/patient/{id}/edit")
    public void saveEditedPatient(@RequestBody Patient editedPatient) {
        patientService.updatePatient(editedPatient);
    }
}
