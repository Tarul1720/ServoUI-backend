package com.servo.ServoUI.repo;

import com.servo.ServoUI.modals.ServiceModal;
import com.servo.ServoUI.modals.WorkModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepo extends JpaRepository<WorkModal,Integer> {
}
