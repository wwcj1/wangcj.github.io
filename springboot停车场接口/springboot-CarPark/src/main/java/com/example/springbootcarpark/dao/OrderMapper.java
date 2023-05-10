package com.example.springbootcarpark.dao;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootcarpark.entity.CarPark;
import com.example.springbootcarpark.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {


}
