package com.zoy.springcloud.discoveryClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zouzp on 2019/2/18.
 */
@RestController
public class DisClientController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String getDisClient() {
        String s = "services : " + discoveryClient.getServices();
        System.out.println(s);
        return s;
    }
}
