package com.example.group14admincinemacontrolservice.controller;

import com.example.group14admincinemacontrolservice.entity.Cinema;
import com.example.group14admincinemacontrolservice.service.CinemaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RestController
public class CinemaController {
    @Autowired
    private CinemaSevice cinemaSevice;


    @GetMapping("/api/v1/admin/getCinemaId")
    public List<Object> getCinemaId(HttpSession session){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        return cinemaSevice.selectCinemaId();
    }
    @GetMapping("/api/v1/admin/getCinemaById")
    public Cinema getCinemaById(HttpSession session,@RequestParam int cinemaId){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        return cinemaSevice.selectCinemaById(cinemaId);
    }
    @PostMapping("/api/v1/admin/insCinema")
    public String insertCinema(HttpSession session,@RequestBody @Valid Cinema cinema, BindingResult result){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return "用户权限不足";
        }
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
    public String updateCinema(HttpSession session,@RequestBody @Valid Cinema cinema, BindingResult result){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
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
    public String deleteCinema(HttpSession session,@RequestParam  int cinemaId){
        if(!session.getAttribute("quanxian").toString().equals("1")){
            return null;
        }
        cinemaSevice.deleteCinema(cinemaId);
        return "删除成功";
    }
}
