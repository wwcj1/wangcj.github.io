package com.example.springbootcarpark.service;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootcarpark.entity.Car;
import com.example.springbootcarpark.entity.CarPark;

import java.util.List;

public interface CarParkService  extends IService<CarPark> {
    public List<CarPark> getParkByDetail(String pointDetail);
}
