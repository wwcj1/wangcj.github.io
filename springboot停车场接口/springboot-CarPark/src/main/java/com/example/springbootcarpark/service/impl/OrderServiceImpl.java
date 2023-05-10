package com.example.springbootcarpark.service.impl;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootcarpark.dao.CarParkMapper;
import com.example.springbootcarpark.dao.OrderMapper;
import com.example.springbootcarpark.dao.UserMapper;
import com.example.springbootcarpark.entity.CarPark;
import com.example.springbootcarpark.entity.Order;
import com.example.springbootcarpark.entity.User;
import com.example.springbootcarpark.service.OrderService;
import com.example.springbootcarpark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
   @Autowired
    CarParkMapper carParkMapper;
   @Autowired
   OrderMapper orderMapper;
    @Override
    public boolean saveOrder(int carParkId, int userId) {

        CarPark carPark = carParkMapper.selectById(carParkId);
        String name = carPark.getName();
        double price = carPark.getPrice();
        Order order = new Order();
        order.setName(name);
        order.setUserId(userId);
        order.setParkId(carParkId);
        order.setStatus(0);
        order.setCreateTime(new Date());
        orderMapper.insert(order);
        return true;
    }


    @Override
    public boolean payOrder(int orderId) {
        Order order = orderMapper.selectById(orderId);
        order.setPayTime(new Date());
        if(order.getStatus()==0) {
            order.setStatus(1);
        }else{
            return false;
        }
        int rows = orderMapper.updateById(order);
        if(rows==1){
            return true;
        }else
        return false;
    }

    @Override
    public boolean deleteOrder(int orderId) {
        if(orderMapper.deleteById(orderId)==1){
            return true;
        }else{
            return false;
        }
    }
}
