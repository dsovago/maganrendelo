package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByPatientId(long id);

    List<Appointment> findByDoctorId(long id);
}
