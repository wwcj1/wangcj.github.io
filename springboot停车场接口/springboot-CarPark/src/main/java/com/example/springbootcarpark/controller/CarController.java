package com.example.springbootcarpark.controller;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.example.springbootcarpark.entity.Car;
import com.example.springbootcarpark.entity.User;
import com.example.springbootcarpark.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Api(value = "车辆接口", tags = {"车辆接口"})
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping("/getallcar")
    @ApiOperation("获得所有车辆")
    public List<Car> getAllCar(User user){
        int id = user.getId();
        return carService.list();
    }
    @PostMapping("/save")
    @ApiOperation("保存车辆")
    public boolean savecar(Car car){
        car.setCreatedTime(new Date());
        return carService.save(car);
    }

    @GetMapping("/delete/{carId}")
    @ApiOperation("删除车辆")
    public boolean deletecar(@PathVariable("carId") int carId){
        return carService.removeById(carId);
    }



}

