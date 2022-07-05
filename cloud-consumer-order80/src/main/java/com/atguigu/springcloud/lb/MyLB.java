package com.atguigu.springcloud.lb;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
//            为什么是214793647？因为整型的最大值是这个
            next = current>=214793647?0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("第几次访问的次数next：=====>"+next);
        return next;
    }


    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstanceList) {
        //根据负载均衡的核心设计思想，取余数

        int index = getAndIncrement() % serviceInstanceList.size();

        return serviceInstanceList.get(index);
    }
}
