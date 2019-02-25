package com.zoy.springcloud.controller.trace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zouzp on 2019/2/22.
 */
@RestController
@RequestMapping("call")
public class TraceController {

    private static final Logger log = LoggerFactory.getLogger(TraceController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("trace-a")
    public String getTraceA() {
        log.info("==========trace a============");
        // ·调用 trace-b服务
        String s = restTemplate.getForEntity("http://trace-b/call/trace-b", String.class).getBody();
        log.info("trace-a restTemplate result : " + s);
        return s;
    }
}
