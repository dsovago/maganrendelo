package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.model.Surgery;
import com.temalabor.maganrendelo.repository.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeryService {

    SurgeryRepository surgeryRepository;

    @Autowired
    public void setSurgeryRepository(SurgeryRepository surgeryRepository) {
        this.surgeryRepository = surgeryRepository;
    }

    public List<Surgery> getSurgeries(){ return surgeryRepository.findAll(); }

    public Surgery getSurgeryById(long id) { return surgeryRepository.findById(id); }

    public void saveSurgery(Surgery surgery) { surgeryRepository.save(surgery); }

    public void deleteSurgeryById(long id) { surgeryRepository.deleteById(id); }
}
