package com.example.springbootcarpark.dao;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootcarpark.entity.CarPark;
import com.example.springbootcarpark.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarParkMapper extends BaseMapper<CarPark> {
    public List<CarPark> getParkByDetail(String pointDetail);
}
