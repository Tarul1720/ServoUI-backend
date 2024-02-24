package com.servo.ServoUI.service;

import com.servo.ServoUI.modals.LocationServing;
import com.servo.ServoUI.modals.ServiceModal;
import com.servo.ServoUI.repo.LocationServingRepo;
import com.servo.ServoUI.repo.ServiceRepo;
import com.servo.ServoUI.request.LocationServingRequest;
import com.servo.ServoUI.request.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServingService {
    @Autowired
    LocationServingRepo serviceRepo;

    public void createService(LocationServingRequest serviceRequest){
        LocationServing serviceModal=new LocationServing();
        serviceModal.setLatitude(serviceRequest.getLatitude());
        serviceModal.setLongiude(serviceRequest.getLongiude());
        serviceModal.setRating(serviceRequest.getRating());
        serviceModal.setUserId(serviceRequest.getUserId());
        serviceRepo.save(serviceModal);

    }
    public List<LocationServing> findAll(){
        return serviceRepo.findAll();

    }
    public List<LocationServing> findAllById(List<Integer> ids){
        return serviceRepo.findAllById(ids);

    }
    public void DeleteAllService(List<Integer> id){
        serviceRepo.deleteAllById(id);
    }


}
