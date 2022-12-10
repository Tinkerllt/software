package com.example.group14hallservice.controller;

import com.example.group14hallservice.response.ResponseEnitity;
import com.example.group14hallservice.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HallController {
    @Autowired
    private HallService hallService;

    @GetMapping("/api/v1/hall/getHallId")
    public ResponseEnitity<List<Integer>>getHallId(@RequestParam int hallId){
        List<Integer>hallList=hallService.selectHall(hallId);
        if(hallList.size()==0){
            return ResponseEnitity.error(101,"没有该放映厅");
        }
        else return ResponseEnitity.success(hallId);
    }
}
