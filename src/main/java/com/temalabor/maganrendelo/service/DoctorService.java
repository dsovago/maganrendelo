package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.model.Doctor;
import com.temalabor.maganrendelo.model.Surgery;
import com.temalabor.maganrendelo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    DoctorRepository doctorRepository;

    @Autowired
    public void setDoctorRepository(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }


    public List<Doctor> getDoctors() { return doctorRepository.findAll(); }

    public Doctor getDoctorById(long id) { return doctorRepository.findById(id); }

    public List<Doctor> getDoctorsBySurgery(Surgery surgery) { return doctorRepository.findBySurgery(surgery); }

    public void saveDoctor(Doctor doctor){ doctorRepository.save(doctor); }
}
