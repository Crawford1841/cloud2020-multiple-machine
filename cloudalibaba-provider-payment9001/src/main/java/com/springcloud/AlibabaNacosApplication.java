package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosApplication.class,args);
    }
}
