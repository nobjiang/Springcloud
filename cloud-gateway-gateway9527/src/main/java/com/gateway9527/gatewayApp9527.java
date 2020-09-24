package com.gateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: zhaol
 * @create: 2020-09-23 20:19
 **/
@SpringBootApplication
@EnableEurekaClient
public class gatewayApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(gatewayApp9527.class);
    }
}