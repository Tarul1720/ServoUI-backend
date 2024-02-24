package com.servo.ServoUI.repo;

import com.servo.ServoUI.modals.ServiceModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends JpaRepository<ServiceModal,Integer> {

}
