package com.INA219.INA219.repo;

import com.INA219.INA219.models.LossModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LossRepo extends JpaRepository<LossModel, Long> {

}
