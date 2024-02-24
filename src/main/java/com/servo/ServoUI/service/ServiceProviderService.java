package com.servo.ServoUI.service;

import com.servo.ServoUI.modals.ServiceModal;
import com.servo.ServoUI.repo.ServiceRepo;
import com.servo.ServoUI.request.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProviderService {
    @Autowired
    ServiceRepo serviceRepo;


    public void createService(ServiceRequest serviceRequest){
        ServiceModal serviceModal=new ServiceModal();
        serviceModal.setServiceName(serviceRequest.getServiceName());
        serviceModal.setImgUrl(serviceRequest.getImgUrl());
        serviceModal.setShortDesc(serviceRequest.getShortDesc());
        serviceRepo.save(serviceModal);

    }
    public List<ServiceModal> findAll(){
        return serviceRepo.findAll();

    }
    public List<ServiceModal> findAllById(List<Integer> ids){
        return serviceRepo.findAllById(ids);

    }
    public void DeleteAllService(List<Integer> id){
        serviceRepo.deleteAllById(id);
    }




}
