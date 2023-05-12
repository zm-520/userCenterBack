package com.zm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zm.entity.User;
import com.zm.mapper.UserMapper;
import com.zm.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2023-05-12 17:10:14
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}


