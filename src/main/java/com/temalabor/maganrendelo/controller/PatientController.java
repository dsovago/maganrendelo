package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Patient;
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

    @DeleteMapping("/patient/{id}")
    public void deletePatient(@PathVariable String id) { patientService.deletePatientById(Long.parseLong(id)); }
}
