package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.*;
import com.temalabor.maganrendelo.repository.SurgeryRepository;
import com.temalabor.maganrendelo.service.AppointmentService;
import com.temalabor.maganrendelo.service.CommentService;
import com.temalabor.maganrendelo.service.DoctorService;
import com.temalabor.maganrendelo.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SurgeryController {

    @Autowired
    SurgeryService surgeryService;
    @Autowired
    DoctorService doctorService;
    @Autowired
    AppointmentService appointmentService;
    @Autowired
    CommentService commentService;

    @GetMapping("/surgery/{id}")
    public Surgery findSurgery(@PathVariable String id) {
        return surgeryService.getSurgeryById(Long.parseLong(id));
    }

    @GetMapping("/surgery/{id}/doctors")
    public List<Doctor> getDoctorsBySurgery(@PathVariable String id) {
        Surgery surgery = surgeryService.getSurgeryById(Long.parseLong(id));
        return  doctorService.getDoctorsBySurgery(surgery);
    }

    @GetMapping("/surgery/{id}/appointment")
    public List<Doctor> getDoctorsForAppoinment(@PathVariable String id) {
        Surgery surgery = surgeryService.getSurgeryById(Long.parseLong(id));
        return  doctorService.getDoctorsBySurgery(surgery);
    }

    @GetMapping("/surgery/{id}/comments")
    public List<Comment> getCommentsBySurgery(@PathVariable String id) {
        return commentService.getCommentsBySurgeryId(Long.parseLong(id));
    }

    @PostMapping("/surgery/{id}/comments")
    public void newCommentOnSurgery(@PathVariable String id, @RequestBody Comment comment) {
        Surgery surgery = surgeryService.getSurgeryById(Long.parseLong(id));
        comment.setSurgery(surgery);
        commentService.newComment(comment);
    }

    /*@PostMapping("/surgery/{id}/appointment")
    public void newAppointment(@RequestBody Patient patient) {
        Appointment a = new Appointment()
        appointmentService.saveAppointment();}*/
}
