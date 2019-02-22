package com.zoy.springcloud.controller.discoveryClient;

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
    public String getDisClient() throws InterruptedException {
//        Thread.sleep(5000);// ·暂停5秒，使该服务超时，触发熔断
        String s = "services : " + discoveryClient.getServices();
        System.out.println(s);
        return s;
    }
}
