package com.zm.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 用户表(User)表实体类
 *
 * @author makejava
 * @since 2023-05-12 17:10:13
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User  {
    //用户ID@TableId
    private Integer id;

    //用户名
    private String username;
    //密码
    private String password;
    //邮箱
    private String email;
    //手机号码
    private String phoneNumber;
    //创建时间
    private Date createdTime;
    //更新时间
    private Date updatedTime;



}


