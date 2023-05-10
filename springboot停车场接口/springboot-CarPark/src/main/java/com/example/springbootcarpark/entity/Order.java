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
@ApiModel("订单")
@TableName(value = "t_order")
public class Order {
    @ApiModelProperty("订单ID")
    private int id;
    @ApiModelProperty("用户ID")
    private int userId;
    @ApiModelProperty("支付时间")
    private Date payTime;
    @ApiModelProperty("停车场ID")
    private int parkId;
    @ApiModelProperty("停车场名称")
    private String name;
    @ApiModelProperty("停车场价格")
    private double price;
    @ApiModelProperty("订单状态")
    private int status;
    @ApiModelProperty("订单创建时间")
    private Date createTime;
}
