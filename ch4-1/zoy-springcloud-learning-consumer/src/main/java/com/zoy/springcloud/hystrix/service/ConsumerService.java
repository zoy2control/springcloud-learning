package com.zoy.springcloud.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zouzp on 2019/2/20.
 */
@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "myFallback")// ·熔断之后，调用 myFallback()函数
    public String consume() {
        // ·通过 RestTemplate将 服务名consul-client和 /dc拼接成 url，调用 服务中心的服务
        String s = restTemplate.getForObject("http://consul-client/dc", String.class);
        return s;
    }

    // ·熔断之后，被调用的方法
    public String myFallback() {
        return "my fallback";
    }
}
