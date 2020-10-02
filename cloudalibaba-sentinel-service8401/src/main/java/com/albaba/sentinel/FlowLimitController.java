package com.albaba.sentinel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@Slf4j
public class FlowLimitController
{
    @GetMapping("/testA")
    public String testA() {
        log.info("now:"+System.currentTimeMillis());
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }



}
