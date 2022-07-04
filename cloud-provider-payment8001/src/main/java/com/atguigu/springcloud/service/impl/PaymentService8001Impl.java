package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentMapper;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService8001;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService8001Impl implements PaymentService8001 {
    @Resource
    private PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
