package com.servo.ServoUI.repo;

import com.servo.ServoUI.modals.ServiceModal;
import com.servo.ServoUI.modals.SubWorkModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubWorkRepo extends JpaRepository<SubWorkModal,Integer> {
}
