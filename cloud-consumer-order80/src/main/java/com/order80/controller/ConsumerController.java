package com.order80.controller;

import api.common.entity.CommonResult;
import api.common.entity.Payment;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    String paymenturl = "http://APPLICATION8001/payment/get/1";

    @GetMapping("get")
    public String response() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity(paymenturl, String.class);
        return forEntity.getBody();
    }

}