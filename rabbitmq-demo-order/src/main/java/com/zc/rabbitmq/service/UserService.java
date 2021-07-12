package com.zc.rabbitmq.service;

import com.zc.rabbitmq.dao.UserMapper;
import com.zc.rabbitmq.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
