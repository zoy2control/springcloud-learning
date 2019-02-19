package com.zoy.springcloud.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zouzp on 2019/2/19.
 */
@RestController
@RequestMapping("/config/client")
public class ConfigClientController {

    @Value("${name}")
    private String name;

    @GetMapping("name")
    @ResponseBody
    public String getFromValue() {
        return name;
    }
}
