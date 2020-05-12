package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.model.Appointment;
import com.temalabor.maganrendelo.model.Patient;
import com.temalabor.maganrendelo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    PatientRepository patientRepository;
    AppointmentService appointmentService;

    @Autowired
    public void setPatientRepository(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Autowired
    public void setAppointmentService(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }


    public void newPatient(Patient patient) {
        patientRepository.save(patient);

    }

    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    public List<Patient> getPatients() { return patientRepository.findAll(); }

    public Patient getPatientById(long id) { return patientRepository.findById(id); }

    public Patient getPatientByTaj(String taj) { return patientRepository.findByTaj(taj); }

    public List<Patient> getPatietsByDoctor(long doctorId) {
        List<Appointment> appointments = appointmentService.getAppointmentsByDoctor(doctorId);
        ArrayList<Patient> patients = new ArrayList<>();
        for (Appointment a : appointments){
            patients.add(patientRepository.findById(a.getPatientId()));
        }
        return patients;
    }
}
