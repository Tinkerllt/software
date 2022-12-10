package com.example.group14orderservice.controller;

import com.example.group14orderservice.exception.OrderSuccessCodeMsg;
import com.example.group14orderservice.response.ResponseEnitity;
import com.example.group14orderservice.service.SeatSevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SeatController {
    @Autowired
    private SeatSevice seatSevice;
    @GetMapping("/api/v1/order/getSeat")
    public ResponseEnitity<boolean[][]> getSeat(@RequestParam int scheduleId) {
        return ResponseEnitity.success(OrderSuccessCodeMsg.SEAT_OK,seatSevice.selectSeat(scheduleId));

    }
}
