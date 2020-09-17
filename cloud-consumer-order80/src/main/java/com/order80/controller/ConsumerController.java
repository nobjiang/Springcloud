package com.order80.controller;

import api.common.entity.CommonResult;
import api.common.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud
 * @description: consumer
 * @author: zhaol
 * @create: 2020-09-15 16:52
 **/
@RestController
public class ConsumerController {
    @Resource
    RestTemplate restTemplate;

    String paymenturl = "http://127.0.0.1:8001/payment/create";

    @GetMapping("create")
    public CommonResult<Payment> response(Payment payment) {
        return restTemplate.postForObject(paymenturl, payment, CommonResult.class);
    }

}