package com.atguigu.boot.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 老贼
 * @version : 1.0
 * @Project : jucjvm
 * @Package : com.atguigu.boot.entities
 * @ClassName : Customer.java
 * @createTime : 2022/9/14 19:02
 * @Email :851185679@qq.com
 * @Description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("顾客信息entity")
public class Customer implements Serializable {

    @ApiModelProperty(value = "主键id",hidden = true)
    private Integer id;
    @ApiModelProperty("顾客名称")
    private String cname;
    @ApiModelProperty("顾客年龄")
    private Integer age;
    @ApiModelProperty("顾客手机号")
    private String phone;
    @ApiModelProperty("顾客性别")
    private Byte sex;
    @ApiModelProperty(value = "顾客生日",hidden = true)
    //设置时间基本格式
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date birth;
}
