package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EnableCircuitBreaker
@EnableHystrix
public class FeignHystirxOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystirxOrder80.class,args);
    }
}
