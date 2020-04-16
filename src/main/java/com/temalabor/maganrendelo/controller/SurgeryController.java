package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.Doctor;
import com.temalabor.maganrendelo.model.Surgery;
import com.temalabor.maganrendelo.repository.SurgeryRepository;
import com.temalabor.maganrendelo.service.DoctorService;
import com.temalabor.maganrendelo.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SurgeryController {

    SurgeryService surgeryService;
    DoctorService doctorService;

    @Autowired
    public void setSurgeryService(SurgeryService surgeryService) {
        this.surgeryService = surgeryService;
    }

    @Autowired
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/surgery/{id}")
    public Surgery findSurgery(@PathVariable String id) {
        return surgeryService.getSurgeryById(Long.parseLong(id));
    }

    @GetMapping("/surgery/{id}/doctors")
    public List<Doctor> getDoctorsBySurgery(@PathVariable String id) {
        return  doctorService.getDoctorsBySurgery(Long.parseLong(id));
    }
}
