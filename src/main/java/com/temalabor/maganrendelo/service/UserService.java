package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.repository.DoctorRepository;
import com.temalabor.maganrendelo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    PatientRepository patientRepo;
    @Autowired
    DoctorRepository doctorRepo;

}
