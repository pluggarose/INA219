package com.INA219.INA219.controller;

import com.INA219.INA219.models.DataModel;
import com.INA219.INA219.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @Autowired
    private DataService dataServicez;
    @GetMapping("/showData")
    public ResponseEntity showData(){
        return ResponseEntity.ok(dataServicez.list());
    }
    @PostMapping("/addData")
    public ResponseEntity addData(@RequestBody DataModel dataModell){
        try {
            dataServicez.saveData(dataModell);
            return ResponseEntity.ok("Ok");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
