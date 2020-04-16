package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

//    List<Appointment> findByPatient_id(long id);
//
//    List<Appointment> findByDoctor_id(long id);
}
