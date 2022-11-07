package com.example.group14travelservice.controller;

import com.example.group14travelservice.entity.Cinema;
import com.example.group14travelservice.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;
    @ResponseBody
    @GetMapping("/api/v1/tavel/cinema/{CityName}")
    public List<Cinema> selectCinemaByCity(@PathVariable String CityName){
        System.out.println(CityName);
        return cinemaService.showall(CityName);
    }

}
