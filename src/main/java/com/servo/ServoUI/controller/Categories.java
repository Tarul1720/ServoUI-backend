package com.servo.ServoUI.controller;

import com.servo.ServoUI.modals.WorkModal;
import com.servo.ServoUI.response.ServiceResponse;
import com.servo.ServoUI.service.CatageroiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Categories {
    @Autowired
    CatageroiesService catageroiesService;
    @GetMapping("/findAllCategories")
    public ResponseEntity<ServiceResponse> findAllServices(){
        return ResponseEntity.status(HttpStatus.OK).body(new ServiceResponse("Success","Sucess fully retived",catageroiesService.fetchAllWork()));
    }
}
