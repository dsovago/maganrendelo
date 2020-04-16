package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.LoginData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDataRepository extends JpaRepository<LoginData, Long> {

    LoginData findByEmail(String email);

}
