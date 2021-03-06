package com.eureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud-eureka-server7001
 * @description: 启动类
 * @author: zhaol
 * @create: 2020-09-17 15:10
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002Controller {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Controller.class,args);
    }
}