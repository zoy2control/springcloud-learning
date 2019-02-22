package com.zoy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zouzp on 2019/2/21.
 */
@RestController
@RequestMapping("/swagger/a")
public class SwaggerAController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("hello")
    public String hello() {
        String s = "Service ： " + discoveryClient.getServices();
        System.out.println(s);
        return s;
    }
}
