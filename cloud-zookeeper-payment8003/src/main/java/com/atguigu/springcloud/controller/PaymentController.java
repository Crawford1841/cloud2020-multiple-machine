package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    DiscoveryClient client;

    @GetMapping(value = "/payment/zk")
    public String paymentzk()
    {
        return "springcloud with zookeeper: "+client.getServices();
    }
}
