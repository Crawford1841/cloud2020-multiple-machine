package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderZkController {
    public static final String INVOKE_URL = "http://payment8003";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/pamentinfo")
    @ResponseBody
    public String getInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }


}
