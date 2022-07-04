package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
//@Repository 用这个新增的时候会有不可预知的问题
public interface PaymentMapper {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
