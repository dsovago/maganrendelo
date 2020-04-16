package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findById(long id);

    Patient findByTaj(String taj);

    /*@Query(value = "update patient p set p.firstname= :firstname, p.lastname= :lastname, p.email= :email, p.tel= :tel, p.taj= :taj where p.id= :id")
    void update(@Param("id") Long id,
                @Param("firstname") String firstname,
                @Param("lastname") String lastname,
                @Param("email") String email,
                @Param("tel") String tel,
                @Param("taj") String taj);*/
}
