package com.servo.ServoUI.service;

import com.servo.ServoUI.modals.ServiceModal;
import com.servo.ServoUI.modals.SubWorkModal;
import com.servo.ServoUI.modals.WorkModal;
import com.servo.ServoUI.repo.LocationServingRepo;
import com.servo.ServoUI.repo.ServiceRepo;
import com.servo.ServoUI.repo.SubWorkRepo;
import com.servo.ServoUI.repo.WorkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InsertIntoDBService {
    @Autowired
    LocationServingRepo locationServingRepo;
    @Autowired
    ServiceRepo serviceRepo;
    @Autowired
    SubWorkRepo subWorkRepo;
    @Autowired
    WorkRepo workRepo;


    public void insertAll(List<ServiceModal> services, List<WorkModal> works, List<SubWorkModal> subWorkModalList){
        serviceRepo.saveAll(services);
        workRepo.saveAll(works);

        subWorkRepo.saveAll(subWorkModalList);
    }

}
