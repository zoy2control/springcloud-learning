package com.zoy.springcloud.config;

import com.zoy.springcloud.util.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ·过滤器配置
 * Created by zouzp on 2019/2/21.
 */
@Configuration
public class FilterConfig {
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
