package com.atguigu.springcloud.fallback;

import com.atguigu.springcloud.service.PaymentFeignHysitrxService;
import org.springframework.stereotype.Component;

@Component
public class FallbackServicePaymentService implements PaymentFeignHysitrxService {
    @Override
    public String paymentInfoHysitrx(Integer id) {
        return "服务发生故障，请稍后重试！";
    }

    @Override
    public String paymentInfo(Integer id) {
        return "服务发送故障，请稍后重试！";
    }
}
