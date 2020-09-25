package com.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2020
 * @description:
 * @author: zhaol
 * @create: 2020-09-25 14:33
 **/
@RestController
@RefreshScope
public class TestController {

    @Value("${app}")
    private String configInfo;

    @GetMapping("info")
    public String info(){
        return configInfo;
    }
}