package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentInfoOk(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentOkId" + id;
    }

    @HystrixCommand(fallbackMethod = "PaymentExceptionHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id)
    {
        int second = 5;
        try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"O(∩_∩)O，耗费秒: "+second;
    }

    public String PaymentExceptionHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "PaymentExceptionHandler" + id + "   /(ㄒoㄒ)/~~";
    }
}
