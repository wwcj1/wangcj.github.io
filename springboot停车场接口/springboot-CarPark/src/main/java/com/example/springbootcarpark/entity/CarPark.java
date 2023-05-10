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
@ApiModel("停车场")
@TableName(value = "t_carpark")
public class CarPark {
    @ApiModelProperty("停车场ID")
    private int id;
    @ApiModelProperty("停车场名称")
    private String name;
    @ApiModelProperty("剩余车位")
    private String residueVehicleNum;
    @ApiModelProperty("经度")
    private String longitude;
    @ApiModelProperty("维度")
    private String latitude;
    @ApiModelProperty("标签")
    private String tags;
    @ApiModelProperty("收费标准")
    private String rates;
    @ApiModelProperty("状态")
    private String state;
    @ApiModelProperty("地图名称")
    private String pointName;
    @ApiModelProperty("详细地址")
    private String pointDetail;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("创建人")
    private String createBy;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("修改人")
    private String updateBy;
    @ApiModelProperty("修改时间")
    private Date updateTime;
    @ApiModelProperty("价格/h")
    private double price;
}
