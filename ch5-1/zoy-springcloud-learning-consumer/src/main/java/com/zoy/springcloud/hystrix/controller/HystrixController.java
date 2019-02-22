package com.zoy.springcloud.hystrix.controller;

import com.zoy.springcloud.hystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zouzp on 2019/2/20.
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("fallback")
    public String callFallback() {
        return consumerService.consume();
    }
}
