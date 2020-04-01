package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findById(long id);

    Patient findByTaj(String taj);
}
