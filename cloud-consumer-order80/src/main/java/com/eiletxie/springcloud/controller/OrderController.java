package com.eiletxie.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Author EiletXie
 * @Since 2020/3/9 13:51
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    RestTemplate restTemplate;

    String paymenturl = "http://APPLICATION8001/payment/get/1";

    @GetMapping("get")
    public String response() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity(paymenturl, String.class);
        return forEntity.getBody();
    }
}
