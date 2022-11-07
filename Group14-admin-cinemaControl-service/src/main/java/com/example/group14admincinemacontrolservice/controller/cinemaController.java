package com.example.group14admincinemacontrolservice.controller;

import com.example.group14admincinemacontrolservice.entity.Cinema;
import com.example.group14admincinemacontrolservice.service.CinemaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

@RestController
public class cinemaController {
    @Autowired
    private CinemaSevice cinemaSevice;

    @PostMapping("api/v1/admin/insCinema")
    public ResponseEntity<String> insertCinema(@RequestBody @Valid Cinema cinema, BindingResult result){
        System.out.println(result);
        System.out.println(cinema);
        if(result.hasErrors()){
            return ResponseEntity.status(BAD_REQUEST).body("插入失败");
        }
        else {
            //do it
            cinemaSevice.InsertCinema(cinema);
            return ResponseEntity.status(OK).body("插入成功");
        }

    }
    @PutMapping("/api/v1/admin/udCinemaInfo")
    public String updateCinema(@RequestBody Cinema cinema){
        return "1";
    }
}
