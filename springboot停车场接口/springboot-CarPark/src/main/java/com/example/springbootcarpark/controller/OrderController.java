package com.example.springbootcarpark.controller;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.example.springbootcarpark.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "订单接口", tags = {"订单接口"})
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("saveOrder")
    @ApiOperation("保存订单")
    public boolean saveOrder(int carParkId,int userId){
        return orderService.saveOrder(carParkId,userId);
    }
    @GetMapping("payOrder")
    @ApiOperation("支付订单")
    public boolean payOrderById(int orderId){
        return orderService.payOrder(orderId);
    }
    @GetMapping("deleteOrder")
    @ApiOperation("删除订单")
    public boolean deleteOrderById(int orderId){
        return orderService.deleteOrder(orderId);
    }
}
