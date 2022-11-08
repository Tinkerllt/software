package com.example.group14admincinemacontrolservice.controller;

import com.example.group14admincinemacontrolservice.entity.Cinema;
import com.example.group14admincinemacontrolservice.service.CinemaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CinemaController {
    @Autowired
    private CinemaSevice cinemaSevice;
    @GetMapping("/api/v1/admin/getCinemaId")
    public List<Object> getCinemaId(){
        return cinemaSevice.selectCinemaId();
    }
    @GetMapping("/api/v1/admin/getCinemaById")
    public Cinema getCinemaById(@RequestParam int cinemaId){
        return cinemaSevice.selectCinemaById(cinemaId);
    }
    @PostMapping("/api/v1/admin/insCinema")
    public String insertCinema(@RequestBody @Valid Cinema cinema, BindingResult result){
        if(result.hasErrors()){
            return "错误提示码:"+result.getFieldError().getDefaultMessage();
        }
        else {
            //do it
            cinemaSevice.InsertCinema(cinema);
            return "插入成功";
        }

    }
    @PutMapping("/api/v1/admin/udCinemaInfo")
    public String updateCinema(@RequestBody @Valid Cinema cinema, BindingResult result){

        if(result.hasErrors()){
            return "错误提示码:"+result.getFieldError().getDefaultMessage();
        }
        else {
            //do it
            cinemaSevice.UpdateCinema(cinema);
            return "修改成功";
        }
    }

    @DeleteMapping("/api/v1/admin/delCinema")
    public String deleteCinema(@RequestParam  int cinemaId){
        cinemaSevice.deleteCinema(cinemaId);
        return "删除成功";
    }
}
