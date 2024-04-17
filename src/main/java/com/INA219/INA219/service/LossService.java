package com.INA219.INA219.service;

import com.INA219.INA219.models.LossModel;
import com.INA219.INA219.repo.LossRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LossService {
    private final LossRepo lossRepo;

    public LossService(LossRepo lossRepo) {
        this.lossRepo = lossRepo;
    }

    public List<LossModel> list() {
        List<LossModel> foundDataa = lossRepo.findAll();
        return foundDataa;
    }
    public List<LossModel> saveData(List<LossModel> lossModels){
        List<LossModel> savedDataModels = new ArrayList<>();
        for (LossModel lossModel : lossModels) {
            LossModel _lossModel = new LossModel(lossModel.getId(), lossModel.getSend(), lossModel.getReceive(), lossModel.getAnswer());
            savedDataModels.add(lossRepo.save(_lossModel));
        }
        return savedDataModels;
    }

}
