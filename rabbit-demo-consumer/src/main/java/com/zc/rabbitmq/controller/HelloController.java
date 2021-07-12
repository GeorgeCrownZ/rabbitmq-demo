package com.zc.rabbitmq.controller;

import com.zc.rabbitmq.entity.User;
import com.zc.rabbitmq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    UserService userService;

    @RequestMapping("/consumer/user")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }
}
