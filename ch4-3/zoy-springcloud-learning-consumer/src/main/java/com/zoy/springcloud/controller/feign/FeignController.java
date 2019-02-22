package com.zoy.springcloud.controller.feign;

import com.zoy.springcloud.api.IDisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zouzp on 2019/2/18.
 */
@RestController
public class FeignController {
    @Autowired
    private IDisClient disClient;

    @GetMapping("/dc/feign")
    public String feignCall() {
        System.out.println(disClient.feignConsumer());
        return disClient.feignConsumer();// ·直接从 接口返回 服务的调用结果
    }
}
