package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {

    Surgery findById(long id);
}
