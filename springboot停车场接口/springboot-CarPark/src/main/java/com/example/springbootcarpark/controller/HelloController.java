package com.example.springbootcarpark.controller;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.example.springbootcarpark.entity.Car;
import com.example.springbootcarpark.entity.User;
import com.example.springbootcarpark.service.CarService;
import com.example.springbootcarpark.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "测试接口", tags = {"测试接口"})
public class HelloController {
    @GetMapping
    public String hello() {
        return "hello";
    }
    @Autowired
    UserService userService;
    @Autowired
    CarService carService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }
    @GetMapping("/list1")
    public List<Car> list1(){
        return carService.list();
    }
}
