package com.example.springbootcarpark.service.impl;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootcarpark.dao.CarParkMapper;
import com.example.springbootcarpark.dao.UserMapper;
import com.example.springbootcarpark.entity.CarPark;
import com.example.springbootcarpark.entity.User;
import com.example.springbootcarpark.service.CarParkService;
import com.example.springbootcarpark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarParkServiceImpl extends ServiceImpl<CarParkMapper, CarPark> implements CarParkService {
    @Autowired
    CarParkMapper carParkMapper;
    @Override
    public List<CarPark> getParkByDetail(String pointDetail) {

    return  carParkMapper.getParkByDetail(pointDetail);
    }
}
