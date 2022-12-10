package com.example.group14orderservice.controller;

import com.example.group14dubboapi.account.DubboAccount;
import com.example.group14orderservice.entity.OrderInfo;
import com.example.group14orderservice.exception.OrderException;
import com.example.group14orderservice.exception.OrderExceptionCodeMsg;
import com.example.group14orderservice.exception.OrderSuccessCodeMsg;
import com.example.group14orderservice.response.ResponseEnitity;
import com.example.group14orderservice.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @DubboReference
    private DubboAccount dubboAccount;
    @PostMapping("/api/v1/order/insertOrder")
    public ResponseEnitity<String> insertOrder(@RequestBody OrderInfo orderInfo){
        if(dubboAccount.getMoney(orderInfo.getUserName())<orderInfo.getOrderPrice()){
            throw new OrderException(OrderExceptionCodeMsg.INSUFFICIENT_FUNDS);
        }
        else if(!orderService.insertOrder(orderInfo)){
            throw new OrderException(OrderExceptionCodeMsg.SEAT_ALREADY_SOLD);
        }
        dubboAccount.reduceMoney(orderInfo.getUserName(),orderInfo.getOrderPrice());
        return ResponseEnitity.success(OrderSuccessCodeMsg.INSERT_OK,null);
    }
    @PutMapping("/api/v1/order/refund")
    public ResponseEnitity<String>reFund(@RequestParam String userName,@RequestParam int orderId){
        double price=orderService.reFund(orderId,2);
        if(dubboAccount.addMoney(userName,price)){
            return ResponseEnitity.success(OrderSuccessCodeMsg.REFUND_OK,null);
        }
        else throw new OrderException(OrderExceptionCodeMsg.REFUND_FAIL);
    }
    @PutMapping("/api/v1/order/useTicket")
    public ResponseEnitity<String>useTikect(@RequestParam String userName,//可以不用,保证数据传输一致
                                            @RequestParam int orderId){
        if(orderService.useTikcet(orderId,0)){
            return ResponseEnitity.success(OrderSuccessCodeMsg.USE_OK,null);
        }
        else throw new OrderException(OrderExceptionCodeMsg.USE_FAIL);
    }

//    @GetMapping("/api/v1/order/cinemaincome")//admin
//    public ResponseEnitity<List<OrderInfo>>getCinemaIncome(@RequestParam int cinemaId){
//
//    }
}
