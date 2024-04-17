package com.INA219.INA219.controller;

import com.INA219.INA219.models.LossModel;
import com.INA219.INA219.service.LossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class LossController {
    private final LossService lossService;

    public LossController(LossService lossService) {
        this.lossService = lossService;
    }

    @Autowired
    private LossService lossServicez;
    @GetMapping("/showLoss")
    public ResponseEntity showLoss(){
        return ResponseEntity.ok(lossServicez.list());
    }
    @PostMapping("/addLoss")
    public ResponseEntity addLoss(@RequestBody List<LossModel> lossModell){
        try {
            lossServicez.saveData(lossModell);
            return ResponseEntity.ok("Ok");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
