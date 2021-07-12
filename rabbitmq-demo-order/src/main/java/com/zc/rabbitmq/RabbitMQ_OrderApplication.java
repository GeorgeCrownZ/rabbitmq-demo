package com.zc.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RabbitMQ_OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQ_OrderApplication.class, args);
    }
}
