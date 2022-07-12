package com.atguigu.springcloud.service;

import com.atguigu.springcloud.fallback.FallbackServicePaymentService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = FallbackServicePaymentService.class)
public interface PaymentFeignHysitrxService {

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfoHysitrx(@PathVariable(value = "id") Integer id);


    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo(@PathVariable(value = "id") Integer id);
}
