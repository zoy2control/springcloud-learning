package com.zoy.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zouzp on 2019/2/18.
 */
@RestController
public class RibbonController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dc/ribbon")
    public String ribbonController() {
        // ·这里 url是代消费的服务接口。这里采用服务名的方式：比如此处的 consul-client，而是具体的 ip + 端口（从 LoadBalancerClient获取）
        // ·因为Spring Cloud Ribbon有一个拦截器，它能够在这里进行实际调用的时候，自动的去选取服务实例，并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用。
        String result = restTemplate.getForObject("http://consul-client/dc", String.class);
        System.out.println(result);
        return result;
    }
}
