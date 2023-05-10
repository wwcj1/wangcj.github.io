package com.example.springbootcarpark.service.impl;/*
 * @Author snoopy
 * @Date $ $
 * @Param $

 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootcarpark.dao.UserMapper;
import com.example.springbootcarpark.entity.User;
import com.example.springbootcarpark.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
