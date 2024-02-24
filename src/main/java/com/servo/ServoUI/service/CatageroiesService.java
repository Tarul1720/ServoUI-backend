package com.servo.ServoUI.service;

import com.servo.ServoUI.modals.WorkModal;
import com.servo.ServoUI.repo.WorkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatageroiesService {
    @Autowired
    WorkRepo workRepo;

    public List<WorkModal> fetchAllWork(){
       return workRepo.findAll();
    }
}
