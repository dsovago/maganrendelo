package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.Doctor;
import com.temalabor.maganrendelo.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findById(long id);

    Doctor findByEmail(String email);

    List<Doctor> findBySurgery(Surgery surgery);
}
