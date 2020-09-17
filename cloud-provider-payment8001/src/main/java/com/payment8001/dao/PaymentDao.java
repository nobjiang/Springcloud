package com.payment8001.dao;

import com.payment8001.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud
 * @description: paymentdao
 * @author: zhaol
 * @create: 2020-09-15 12:19
 **/
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}