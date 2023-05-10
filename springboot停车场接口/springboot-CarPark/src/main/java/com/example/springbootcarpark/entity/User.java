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
@ApiModel("用户")
@TableName(value = "t_user")
public class User {
    @ApiModelProperty("用户ID")
    private int id;
    @ApiModelProperty("昵称")
    private String nickName;
    @ApiModelProperty("头像")
    private String avatarUrl;
    @ApiModelProperty("性别")
    private int gender;
    @ApiModelProperty("电话")
    private String phone;
    @ApiModelProperty("状态")
    private String state;
    @ApiModelProperty("创建人")
    private String createBy;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("修改人")
    private String updateBy;
    @ApiModelProperty("修改时间")
    private Date updateTime;

}
