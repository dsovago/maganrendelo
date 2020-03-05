package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(int id);

}
