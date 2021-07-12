package com.zc.rabbitmq.service;

import com.zc.rabbitmq.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(value = "rabbitmq-demo-order-8080")
public interface UserService {

    @GetMapping("/user")
    public List<User> getAllUser();
}
