package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.model.Comment;
import com.temalabor.maganrendelo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public void newComment(Comment comment) {
        commentRepository.save(comment);
    }

    public List<Comment> getCommentsBySurgeryId (long surgeryId) {
        return commentRepository.findBySurgeryId(surgeryId);
    }
}
