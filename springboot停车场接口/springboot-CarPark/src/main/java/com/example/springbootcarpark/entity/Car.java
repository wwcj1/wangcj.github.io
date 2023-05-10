package com.example.springbootcarpark.entity;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("车辆")
@TableName(value = "t_car")
public class Car {
    @ApiModelProperty(" 车ID")
    private int id;
    @ApiModelProperty(" 车牌号")
    private String plateNumber;
    @ApiModelProperty(" 车辆类型")
    private String carType;
    @ApiModelProperty(" 车牌颜色")
    private String plateColour;
    @ApiModelProperty(" 车辆品牌")
    private String carBrand;
    @ApiModelProperty(" 车辆颜色")
    private String carColour;
    @ApiModelProperty(" 创建时间")
    private Date createdTime;
    @ApiModelProperty(" 更新时间")
    private Date updatedTime;
    @ApiModelProperty(" 所属用户ID")
    private int uid;//用户id
}
