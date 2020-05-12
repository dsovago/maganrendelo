package com.temalabor.maganrendelo.repository;

import com.temalabor.maganrendelo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment findById(long id);

    List<Comment> findBySurgeryId(long surgeryId);
}