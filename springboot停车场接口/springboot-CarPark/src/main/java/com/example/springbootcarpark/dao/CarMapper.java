package com.example.springbootcarpark.dao;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootcarpark.entity.Car;
import com.example.springbootcarpark.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper extends BaseMapper<Car> {

}
