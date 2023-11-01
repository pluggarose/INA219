package com.INA219.INA219.service;

import com.INA219.INA219.repo.DataRepo;
import com.INA219.INA219.models.DataModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private final DataRepo dataRepo;

    public DataService(DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }

    public List<DataModel> list() {
        List<DataModel> foundData = dataRepo.findAll();
        return foundData;
    }
    public DataModel saveData(DataModel dataModel){
        DataModel _dataModel = new DataModel(dataModel.getId(),dataModel.getAmperage(),dataModel.getVoltage());
        return dataRepo.save(_dataModel);
    }

}
