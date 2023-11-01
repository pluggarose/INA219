package com.INA219.INA219.repo;

import com.INA219.INA219.models.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepo extends JpaRepository<DataModel, Long> {

}
