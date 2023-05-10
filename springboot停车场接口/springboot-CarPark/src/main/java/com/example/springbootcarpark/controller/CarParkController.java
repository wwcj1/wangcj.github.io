package com.example.springbootcarpark.controller;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.example.springbootcarpark.dao.CarParkMapper;
import com.example.springbootcarpark.entity.CarPark;
import com.example.springbootcarpark.service.CarParkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "停车场接口", tags = {"停车场接口"})
public class CarParkController {
    @Autowired
    CarParkService carParkService;

    @GetMapping("/allcarpark")
    @ApiOperation("查询停车场")
    public List<CarPark> getAllCarpark(){
        return carParkService.list();
    }

    @GetMapping("/detail")
    @ApiOperation("通过详细地址查询停车场信息")
    public List<CarPark> getParkByDetail(String pointDetail) {
       return carParkService.getParkByDetail(pointDetail);
    }
}
