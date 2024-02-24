package com.servo.ServoUI.controller;

import com.servo.ServoUI.modals.ServiceModal;
import com.servo.ServoUI.request.ServiceRequest;
import com.servo.ServoUI.response.ServiceResponse;
import com.servo.ServoUI.service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ServicProviderController {

    @Autowired
    ServiceProviderService serviceProviderService;

    @GetMapping("/findAllService")
    public ResponseEntity<ServiceResponse> findAllServices(){
        return ResponseEntity.status(HttpStatus.OK).body(new ServiceResponse("Success","Sucess fully retived",serviceProviderService.findAll()));
    }
    @PostMapping("/createService")
    public  ResponseEntity<ServiceResponse> createService(@RequestBody ServiceRequest serviceReuest){
        serviceProviderService.createService(serviceReuest);
        return ResponseEntity.status(HttpStatus.OK).body(new ServiceResponse("Success","Successfully inserted",null));
    }

    @PostMapping("/deletedAll")
    public  ResponseEntity<ServiceResponse> createService(@RequestBody List<Integer> ids){
        serviceProviderService.DeleteAllService(ids);
        return ResponseEntity.status(HttpStatus.OK).body(new ServiceResponse("Success","Successfully deleted",null));
    }
}
