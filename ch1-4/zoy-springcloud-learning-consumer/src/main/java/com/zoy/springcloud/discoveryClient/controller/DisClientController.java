package com.zoy.springcloud.discoveryClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zouzp on 2019/2/18.
 */
@RestController
public class DisClientController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dc/consumer")
    public String disClientController() {
        // ·eureka-consumer如何消费 eureka-client的 "/dc"接口的
        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-client");// ·负载均衡的选出一个“consul-client”的实例
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url,String.class);// ·对 服务提供者接口的调用
    }
}
