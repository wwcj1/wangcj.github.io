package com.example.springbootcarpark.service.impl;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootcarpark.dao.CarMapper;
import com.example.springbootcarpark.entity.Car;
import com.example.springbootcarpark.service.CarService;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {
}
